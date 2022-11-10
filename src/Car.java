import Objects.CarObject;

import java.util.Scanner;

public class Car {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        CarObject c1 = new CarObject();
        c1.fuelConsumption=7;
        c1.brand="Audi";
        c1.serialnumber="A1234";
        c1.fuelAmount=60;
        c1.maxFuel= c1.fuelAmount;

        CarObject c2 = new CarObject();
        c2.fuelConsumption=7;
        c2.brand="Opel";
        c2.serialnumber="O1234";
        c2.fuelAmount=50;
        c2.maxFuel= c2.fuelAmount;

        CarObject c3 = new CarObject();
        c3.fuelConsumption=5;
        c3.brand="Mercedes";
        c3.serialnumber="M1234";
        c3.fuelAmount=40;
        c3.maxFuel= c3.fuelAmount;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.carBreak();
        c2.turboBoost();
        c2.drive();
        System.out.println(c2.fuelAmount);
        System.out.println("Wie oft moechtest du Hupen?");
        int amountOfRepetitions=scanner.nextInt();
        c2.honk(amountOfRepetitions);
        c2.getRemainingRange();
    }
}
