package homework_nr_14;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable{

    public Car(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
