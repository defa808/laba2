package ua.kpi.Model;

import ua.kpi.View;

import java.util.Objects;

public class Precipitation {
    protected TypePrecipitation typePrecipitation;
    protected double amountPrecipitation;

    public Precipitation() {
        this.typePrecipitation = TypePrecipitation.UNDEFINED;
        this.amountPrecipitation = 0;
    }

    public Precipitation(TypePrecipitation typePrecipitation, double amountPrecipitation) {
        this.typePrecipitation = typePrecipitation;
        this.amountPrecipitation = amountPrecipitation;
    }

    @Override
    public Precipitation clone() throws CloneNotSupportedException {
        return new Precipitation(typePrecipitation, amountPrecipitation);
    }

    public void setAmountPrecipitation(double amountPrecipitation) {
        this.amountPrecipitation = amountPrecipitation;
    }

    public void setTypePrecipitation(TypePrecipitation typePrecipitation) {
        this.typePrecipitation = typePrecipitation;
    }

    public double getAmountPrecipitation() {
        return amountPrecipitation;
    }

    public String getTypePrecipitation() {
        switch (this.typePrecipitation) {
            case RAIN:
                return View.RAIN_STRING;
            case SNOW:
                return View.SNOW_STRING;
            case RAINWITHSNOW:
                return View.RAIN_WITH_SNOW_STRING;

            default:
                return View.EMPTY;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precipitation that = (Precipitation) o;
        return amountPrecipitation == that.amountPrecipitation &&
                typePrecipitation == that.typePrecipitation;
    }

    @Override
    public int hashCode() {

        return Objects.hash(typePrecipitation, amountPrecipitation);
    }

    @Override
    public String toString() {
        return getTypePrecipitation() + " " + amountPrecipitation + " " + View.PRECIPITATION_UNITS;
    }
}
