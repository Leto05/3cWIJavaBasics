package at.let.Objects;

public class Fuel {
    private int fuelAmount;
    private int maxFuel;

    public Fuel(int fuelAmount, int maxFuel)
    {this.fuelAmount=fuelAmount;
    this.maxFuel=maxFuel;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getMaxFuel() {
        return maxFuel;
    }
}
