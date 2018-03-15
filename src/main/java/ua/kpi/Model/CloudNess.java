package ua.kpi.Model;
/**
 * Enum CloudNess for Weather
 * @autor Gavriliak
 *
 */
import ua.kpi.View;
import java.util.ResourceBundle;

public enum CloudNess {
    CLEARCLOUD,
    LITTLECLOUD,
    FEWCLOUD,
    OVERCLOUD,
    UNDEFINED;

    @Override
    public String toString() {
        String str;
        switch (this) {
            case FEWCLOUD:
                str = View.CLOUDNESS_FEW;
                break;
            case CLEARCLOUD:
                str = View.CLOUDNESS_CLEARCLOUD;
                break;
            case OVERCLOUD:
                str = View.CLOUDNESS_OVERCLOUD;
                break;
            case LITTLECLOUD:
                str = View.CLOUDNESS_LITTLECLOUD;
                break;
            default:
                str = View.EMPTY;
        }
        return str;
    }
}
