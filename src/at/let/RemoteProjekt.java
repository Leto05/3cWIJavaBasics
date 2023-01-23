package at.let;

import at.let.Objects.Battery;
import at.let.Objects.Remote;

public class RemoteProjekt {
    public static void main(String[] args){
        Battery b1= new Battery(80);
        Battery b2 = new Battery(100);
        Remote remote1 = new Remote(b1,b2);

        remote1.turnOn(b1.getBatteryStatus(),b2.getBatteryStatus());
        remote1.turnOff();
        remote1.getStatus(b1.getBatteryStatus(), b2.getBatteryStatus());
    }
}