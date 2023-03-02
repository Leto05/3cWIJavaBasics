package at.let.inheritance;

public class RaceCar extends Car{
    private String wing;
    public RaceCar(String brand, String colour, String serialNumber, int fuelAmount, String wing) {
        super(brand, colour, serialNumber, fuelAmount);
        this.wing= wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
