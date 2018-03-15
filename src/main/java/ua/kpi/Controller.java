package ua.kpi;


import org.jetbrains.annotations.NotNull;
import ua.kpi.Model.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Gavriliak on 14.02.2018.
 */

public class Controller {

    private Weather model;
    private View view;

    //Constructor
    public Controller(Weather model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        setWeather(sc, model);
        System.out.println(model.toString());

    }

    private double inputOnlyDouble(Scanner sc) {

        while (!sc.hasNextDouble()) {
            view.printMessage(view.WRONG_INPUT_DOUBLE_DATA);
            sc.next();
        }
        return sc.nextDouble();
    }


    private int inputOnlyInt(Scanner sc) {

        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private int inputCorrectInt(Scanner sc, int prevNum, int nextNum) {
        int number = inputOnlyInt(sc);


        while (number < prevNum || number > nextNum){
            view.printMessage(view.WRONG_INPUT_INT_DATA);
            number = inputOnlyInt(sc);
        }
        return number;
    }

    public void setWeather(Scanner sc, Weather weather) {
        view.printMessage(View.INPUT_WEATHER);

        view.printMessage(View.INPUT_DIRECTION_WIND);
        weather.setDirectionWind(inputDirectionWind(sc));

        view.printMessage(View.INPUT_SPEED_WIND);
        weather.setSpeedWind(inputOnlyDouble(sc));

        view.printMessage(View.INPUT_TEMPERATURE);
        weather.setTemperature(inputOnlyDouble(sc));

        view.printMessage(View.INPUT_CLOUDNESS);
        weather.setCloudNess(inputCloudness(sc));

        view.printMessage(View.INPUT_PRECIPITATION);
        weather.setPrecipitation(inputPrecipitation(sc));
    }

    private DirectionWind inputDirectionWind(Scanner sc) {

        for (DirectionWind directionWind : DirectionWind.values()) {
            view.printMessageWithoutBundle(directionWind.ordinal() + " - " + directionWind.toString());
        }

        int directionWay = inputCorrectInt(sc, 0, DirectionWind.values().length);

        return DirectionWind.values()[directionWay];
    }

    private CloudNess inputCloudness(Scanner sc) {
        for (CloudNess cloudNess : CloudNess.values()) {
            view.printMessageWithoutBundle(cloudNess.ordinal() + " - " + cloudNess.toString());
        }

        int index = inputCorrectInt(sc, 0, DirectionWind.values().length);

        return CloudNess.values()[index];
    }

    @NotNull
    private Precipitation inputPrecipitation(Scanner sc) {
        view.printMessage(View.INPUT_TYPE_PRECIPITATION);
        for (TypePrecipitation typePrecipitation : TypePrecipitation.values()) {
            view.printMessageWithoutBundle(typePrecipitation.ordinal() + " - " + typePrecipitation.toString());
        }
        int index = inputCorrectInt(sc, 0, TypePrecipitation.values().length);

        TypePrecipitation typePrecipitation = TypePrecipitation.values()[index];

        view.printMessage(View.INPUT_PRECIPITATION_AMOUNT);
        double amountPrecipitation = inputOnlyDouble(sc);

        return new Precipitation(typePrecipitation, amountPrecipitation);
    }

}
