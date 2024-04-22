package homework_nr_13;

public class Airplane {
    protected String manufacturer;
    protected String model;
    protected int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidModelException, InvalidManufacturerException, InvalidNrOfEngines {
        if(manufacturer == "" || manufacturer == null) throw new InvalidManufacturerException("Incorrect manufacturer!");
        else this.manufacturer = manufacturer;
        if(model == "" || model == null) throw new InvalidModelException("Incorrect model!");
        else this.model = model;
        if(nrOfEngines == 0 || nrOfEngines % 2 != 0) throw new InvalidNrOfEngines("Wrong number of engines!");
        else this.nrOfEngines = nrOfEngines;
    }
}
