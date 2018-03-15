package ua.kpi.Model;

import ua.kpi.View;

import java.util.Objects;
/**
 * class Weather with <b>directionWind</b> <br/> <b>speedWind</b> <br/> <b>temperature</b> <br/> <b>cloudNess</b> <br/> <b>precipitation</b>
 * @autor Gavriliak
 *
 */
public class Weather {
    protected DirectionWind directionWind;
    protected double speedWind;
    protected double temperature;
    protected CloudNess cloudNess;
    protected Precipitation precipitation;


    public Weather() {
        directionWind = DirectionWind.UNDEFINED;
        speedWind = 0;
        temperature = 0;
        cloudNess = CloudNess.UNDEFINED;
        precipitation = new Precipitation();
    }

    public Weather(DirectionWind directionWind, double speedWind, double temperature, CloudNess cloudNess, Precipitation precipitation) {
        this.directionWind = directionWind;
        this.speedWind = speedWind;
        this.temperature = temperature;
        this.cloudNess = cloudNess;
        this.precipitation = precipitation;
    }

    @Override
    protected Weather clone() throws CloneNotSupportedException {
        DirectionWind directionWind = this.directionWind;
        CloudNess cloudNess = this.cloudNess;
        Precipitation precipitation = this.precipitation.clone();
        return new Weather(directionWind, this.speedWind, this.temperature, cloudNess, precipitation);
    }

    public void setCloudNess(CloudNess cloudNess) {
        this.cloudNess = cloudNess;
    }

    public void setDirectionWind(DirectionWind directionWind) {
        this.directionWind = directionWind;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public void setSpeedWind(double speedWind) {
        this.speedWind = speedWind;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getSpeedWind() {
        return (int) speedWind;
    }

    public int getTemperature() {
        return (int) temperature;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public CloudNess getCloudNess() {
        return cloudNess;
    }

    public DirectionWind getDirectionWind() {
        return directionWind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return speedWind == weather.speedWind &&
                temperature == weather.temperature &&
                directionWind == weather.directionWind &&
                cloudNess == weather.cloudNess &&
                Objects.equals(precipitation, weather.precipitation);
    }

    @Override
    public int hashCode() {

        return Objects.hash(directionWind, speedWind, temperature, cloudNess, precipitation);
    }

    @Override
    public String toString() {

        //Weather: sw wind 1m/c, 10C0, cloudness, snow/"" 0mm
        return View.WEATHER + View.IS + getDirectionWind() + " " + View.WIND + " " +
                speedWind + View.WIND_UNITS + ", "
                + temperature + View.TEMPERATURE_UNITS + ", "
                + getCloudNess() + getPrecipitation();
    }
}
