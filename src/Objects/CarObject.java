package Objects;

public class CarObject {
    public int fuelConsumption;
    public String brand;
    public String serialnumber;
    public int fuelAmount;
    public String carBreaks = "Ich bremse";
    public int maxFuel;
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

}
