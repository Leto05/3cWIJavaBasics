package at.let.Objects;

import java.util.List;

public class CarObject {
    private List<RearMirror> mirrors;
    private Engine engine;
    private Fuel fuel;
    private int fuelConsumption;
    private String brand;
    private String serialnumber;
    private String carBreaks = "Ich bremse";
    private String colour;
    public CarObject (RearMirror mirrors ,Fuel fuel,Engine engine,int fuelConsumption, String brand, String serialNumber, String colour)
    {
        this.fuel=fuel;
        this.engine=engine;
        this.fuelConsumption=fuelConsumption;
        this.brand=brand;
        this.serialnumber=serialNumber;
        this.colour=colour;
    }
    public void drive(int speed)
    {
        System.out.println("I am driving with  horsepower: "+getEngine().getHorsePower());
    }
    public void carBreak(){
        System.out.println(this.carBreaks);
    }
    public void turboBoost(){
        if(getFuel().getFuelAmount()>getFuel().getMaxFuel()*0.1){
            System.out.println("SuperBoostMode");
        }
        else{
            System.out.println("Not enough fuel to go Superboost");
        }

    }
    public void honk(int amountOfRepetitions){
        if(amountOfRepetitions<=100){
            for(int i=0; i<amountOfRepetitions;i++){
                System.out.println("Tuut");
            }

        }else {
            System.out.println("Übertreibe es nicht!");
        }
    }
    public void getRemainingRange(){
        System.out.println("Es sind noch ganze: "+getFuel().getFuelAmount()/this.fuelConsumption+" km uebrig.");
    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }
    public String getBrand() {
        return brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Fuel getFuel() {
        return fuel;
    }
}
