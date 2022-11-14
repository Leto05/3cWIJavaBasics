package Objects;

public class CarObject {
    private int fuelConsumption;
    private String brand;
    private String serialnumber;
    private int fuelAmount;
    private String carBreaks = "Ich bremse";
    private int maxFuel;
    private String colour;
    public CarObject (int fuelConsumption, String brand, String serialNumber, int fuelAmount,int maxFuel,String colour)
    {
        this.fuelConsumption=fuelConsumption;
        this.brand=brand;
        this.serialnumber=serialNumber;
        this.fuelAmount=fuelAmount;
        this.maxFuel=maxFuel;
        this.colour=colour;
    }
    public void drive()
    {
        this.fuelAmount=this.fuelAmount-this.fuelConsumption;
        System.out.println("I am driving");
    }
    public void carBreak(){
        System.out.println(this.carBreaks);
    }
    public void turboBoost(){
        if(this.fuelAmount>maxFuel*0.1){
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
        System.out.println("Es sind noch ganze: "+this.fuelAmount/this.fuelConsumption+" km uebrig.");
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

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public String getColour() {
        return colour;
    }
}
