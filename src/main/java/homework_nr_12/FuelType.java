package homework_nr_12;

public enum FuelType {
    PETROL_95(true),
    PETROL_98(false),
    PETROL_100(true),
    DIESEL_51(false),
    DIESEL_55(true),
    METAN(false),
    PROPANE(true),
    ELECTRIC(false);

    final boolean isFuelLiquid;

    FuelType(boolean isFuelLiquidLiquid) {
        this.isFuelLiquid = isFuelLiquidLiquid;
    }

    public void isLiquid(){
        System.out.println(this.name() + "->" + this.isFuelLiquid);
    }
}
