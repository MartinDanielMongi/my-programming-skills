package shape;

public class Shape {    
    private double radius;

    public Shape() {
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Shape radius(double radius) {
        setRadius(radius);
        return this;
    }

}