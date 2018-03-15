package ua.kpi;

import ua.kpi.Model.Weather;

public class Main {

    public static void main(String[] args) {
        Weather model = new Weather();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
