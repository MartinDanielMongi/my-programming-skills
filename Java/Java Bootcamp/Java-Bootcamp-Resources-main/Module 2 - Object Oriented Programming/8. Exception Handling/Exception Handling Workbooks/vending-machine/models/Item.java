package models;
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;   
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("name cannot be null/blank");
        }else if (price<0){
            throw new IllegalArgumentException("Price cannot be less than zero");
        }else if (quantity<0){
            throw new IllegalArgumentException("Quantity cannot be less than zero");
        }
    }
    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("name cannot be null/blank.")
        }else{
        this.name = name;
        }
    }
    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException("Price cannot be less than zero.");
        }else {
            this.price = price;
        }
    }
    public void setQuantity(int quantity) {
        if(quantity<0){
            throw new IllegalArgumentException("quantity cannot be less than zero.");
        }else {
        this.quantity = quantity;
        }
    }

    public String toString() {
        return this.name + ": " + this.price + " ("+this.quantity+")";
    }

}
