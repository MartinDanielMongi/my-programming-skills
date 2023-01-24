package models;

public class Movie {
    private String name;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;
    private String format;

    public Movie(Movie source) {
        this.name = source.name;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
        this.format= source.format;
    }

    public Movie(String name, String format, double rating) {
        if (name.equals(null)||name.isBlank()){
            throw new IllegalArgumentException("Ponele algo copado");
        }
        if (!format.equalsIgnoreCase("DVD") && !format.equalsIgnoreCase("Blue-Ray")){
            throw new IllegalArgumentException("Wrong format");
        }
        if (rating<0 || rating>10){
            throw new IllegalArgumentException("Wrong value at ratings");
        }
        this.name = name;
        this.rating = rating;
        this.format = format;
        this.isAvailable=true;
        if(format.equalsIgnoreCase("Blue-Ray")){
            this.sellingPrice=4.25;
            this.rentalPrice=1.99;
        }else {
            this.sellingPrice=2.25;
            this.rentalPrice=0.99;
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.equals(null)||name.isBlank()){
            throw new IllegalArgumentException("Ponele algo copado");
        }
        this.name = name;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        if ((!format.equalsIgnoreCase("DVD")&& !format.equalsIgnoreCase("Blue-Ray"))|| format==null || format.isBlank()){
            throw new IllegalArgumentException("Wrong format");
        }
        this.format = format;
    
}
    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        if (rating<0 || rating>10){
            throw new IllegalArgumentException("Wrong value at ratings");
        }
        this.rating = rating;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getRentalPrice() {
        return this.rentalPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }



    @Override
    public String toString() {
        return "\t Name: " + getName() + "\n" +

        "\t Format: " + getFormat() + "\n" +
        
        "\t Rating: " + getRating() + "\n" +
        
        "\t Selling Price: " + getSellingPrice() + "\n" +
        
        "\t Rental Price: " + getRentalPrice() + "\n" +
        
        "\t Availability: " + (getIsAvailable() ? "In-stock" :"rented")  + "\n";
    }

}
