package ua.kpi.Model;

import ua.kpi.View;
import java.util.ResourceBundle;

public enum DirectionWind {
    NORTH,
    NORTHEAST,
    EAST,
    SOUTHEAST,
    SOUTH,
    SOUTHWEST,
    WEST,
    NORTHWEST,
    UNDEFINED;

    @Override
    public String toString() {
        String str;
        switch (this) {
            case NORTH:
                str = View.NORTH;
                break;
            case NORTHEAST:
                str = View.NORTHEAST;
                break;
            case EAST:
                str = View.EAST;
                break;
            case SOUTHEAST:
                str = View.SOUTHEAST;
                break;
            case SOUTH:
                str = View.SOUTH;
                break;
            case SOUTHWEST:
                str = View.SOUTHWEST;
                break;
            case WEST:
                str = View.WEST;
                break;
            case NORTHWEST:
                str = View.NORTHWEST;
                break;
            default:
                str = View.UNDEFINED;
                break;
        }
        return str;
    }
}
