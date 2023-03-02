package at.let.inheritance;

public class Truck extends Car{
    private String trailer;
    public Truck(String brand, String colour, String serialNumber, int fuelAmount, String trailer) {
        super(brand, colour, serialNumber, fuelAmount);
        this.trailer=trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
