package test;

public class Invioce {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invioce(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.quantity = ( quantity < 0 ) ? 0 : quantity;
        this.price = ( price < 0 ) ? 0 : price;
    }

    public double getAmount(){
        double returnAmount = quantity * price;
        return returnAmount;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity < 0 ) ? 0 : quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = ( price < 0 ) ? 0 : price;
    }
}
