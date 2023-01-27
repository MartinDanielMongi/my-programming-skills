package product;

public class Product {
    private double price;
    private String color;
    private String brand;

    public Product() {
    }

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product price(double price) {
        setPrice(price);
        return this;
    }

    public Product color(String color) {
        setColor(color);
        return this;
    }

    public Product brand(String brand) {
        setBrand(brand);
        return this;
    }
    

    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            ", color='" + getColor() + "'" +
            ", brand='" + getBrand() + "'" +
            "}";
    }
}
