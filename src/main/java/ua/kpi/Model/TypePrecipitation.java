package ua.kpi.Model;

import ua.kpi.View;
import java.util.ResourceBundle;
/**
 * enum TypePrecipitation for Precipitation
 * @autor Gavriliak
 *
 */
public enum TypePrecipitation {
    RAIN,
    SNOW,
    RAINWITHSNOW,
    UNDEFINED;

    @Override
    public String toString() {
        switch (this){
            case RAIN: return View.RAIN_STRING;
            case SNOW: return View.SNOW_STRING;
            case RAINWITHSNOW: return View.RAIN_WITH_SNOW_STRING;

            default: return View.EMPTY;
        }
    }
}
