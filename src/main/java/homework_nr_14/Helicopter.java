package homework_nr_14;

import java.io.Serializable;

public class Helicopter extends Vehicle implements AirVehicles, Serializable {
    public Helicopter(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
