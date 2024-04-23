package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicle<T extends AirVehicles & Serializable> {
    protected String manufacturer;
    protected String model;
    private List<T> vehicles = new ArrayList<>();

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Vehicle() {

    }

    public void addVehicle(T inputVehicle){
        vehicles.add(inputVehicle);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicles=" + vehicles +
                '}';
    }
}
