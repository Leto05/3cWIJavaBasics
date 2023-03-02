package at.let.inheritance;

public class Car {
    private String brand;
    private String colour;
    private String serialNumber;
    private int fuelAmount;

    public Car(String brand, String colour, String serialNumber, int fuelAmount)
    {
        this.brand=brand;
        this.colour=colour;
        this.serialNumber=serialNumber;
        this.fuelAmount=fuelAmount;
    }

    public void drive ()
    {
        System.out.println("I am driving");
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
