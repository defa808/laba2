package ua.kpi;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Gavriliak on 14.02.2018.
 */

public class View {

    // Resource Bundle Installation's
    private static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua"));  // Ukrainian
                    new Locale("en"));        // English

    //Weather
    public static final String WEATHER = "weather";
    public static final String IS = ": ";
    public static final String WIND = View.getMessage("weather.wind");
    public static final String TEMPERATURE_UNITS = View.getMessage("weather.temperature.units");
    public static final String WIND_UNITS = View.getMessage("weather.wind.units");
    public static final String EMPTY = "";


    //DirectionWind
    public static final String NORTH = View.getMessage("directionwind.north");
    public static final String NORTHEAST = View.getMessage("directionwind.northeast");
    public static final String EAST = View.getMessage("directionwind.east");
    public static final String SOUTHEAST = View.getMessage("directionwind.southeast");
    public static final String SOUTH = View.getMessage("directionwind.south");
    public static final String SOUTHWEST = View.getMessage("directionwind.southwest");
    public static final String WEST = View.getMessage("directionwind.west");
    public static final String NORTHWEST = View.getMessage("directionwind.northwest");
    public static final String UNDEFINED = View.getMessage("directionwind.undefined");

    //CloudNess
    public static final String CLOUDNESS_FEW = View.getMessage("cloudness.few");
    public static final String CLOUDNESS_CLEARCLOUD= View.getMessage("cloudness.clearcloud");
    public static final String CLOUDNESS_OVERCLOUD = View.getMessage("cloudness.overcloud");
    public static final String CLOUDNESS_LITTLECLOUD = View.getMessage("cloudness.littlecloud");

    //Precipitation
    public static final String PRECIPITATION_UNITS = View.getMessage("precipitation.units");

    //typePrecipitation
    public static final String RAIN_WITH_SNOW_STRING = View.getMessage("typePrecipitation.rainwithsnow");
    public static final String RAIN_STRING = View.getMessage("typePrecipitation.rain");
    public static final String SNOW_STRING = View.getMessage("typePrecipitation.snow");

    //Controller
    public static final String WRONG_INPUT_INT_DATA = "wrong.input.data.int";
    public static final String WRONG_INPUT_DOUBLE_DATA = "wrong.input.data.double";

    //Input Controller
    public static final String INPUT_WEATHER = "input.weather";
    public static final String INPUT_DIRECTION_WIND = "input.direction.wind";
    public static final String INPUT_SPEED_WIND = "input.speed.wind";
    public static final String INPUT_TEMPERATURE = "input.temperature";
    public static final String INPUT_CLOUDNESS = "input.cloudness";
    public static final String INPUT_PRECIPITATION = "input.precipitation";
    public static final String INPUT_TYPE_PRECIPITATION = "input.type.precipitation";
    public static final String INPUT_PRECIPITATION_AMOUNT = "input.precipitation.amount";


    public static String getMessage(String messages){
//        StringBuilder concatString = new StringBuilder();
//        for (String v : messages) {
//            concatString = concatString.append(bundle.getString(v));
//        }
        String message = bundle.getString(messages);
//        String message = new String(concatString);
        return message;
    }

    public void printMessage(String... messages) {
        StringBuilder concatString = new StringBuilder();
        for (String v : messages) {
            concatString = concatString.append(bundle.getString(v));
        }
        String message = new String(concatString);
        System.out.println(message);
    }

    public void printMessageWithoutBundle(String...messages){
        StringBuilder concatString = new StringBuilder();
        for (String v : messages) {
            concatString = concatString.append(v);
        }
        String message = new String(concatString);
        System.out.println(message);
    }
}
