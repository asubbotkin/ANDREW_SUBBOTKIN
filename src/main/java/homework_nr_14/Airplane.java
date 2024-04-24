package homework_nr_14;

import java.io.Serializable;

public class Airplane extends Vehicle implements AirVehicles, Serializable {
    public Airplane(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

