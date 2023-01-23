package at.let.Objects;

import at.let.Objects.Battery;

public class Remote {
private int batteryStatus;
public Remote(Battery battery, Battery battery2)
    {
        this.batteryStatus= battery.getBatteryStatus();
        this.batteryStatus=battery2.getBatteryStatus();
    }
    public void turnOn(int battery, int battery2){
        System.out.println("Verbraucher angeschlossen");
        battery=battery-5;
        battery2=battery2-5;
    }
    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public void getStatus(int battery1, int battery2){
        System.out.println((battery1+battery2)/2);
    }
}
