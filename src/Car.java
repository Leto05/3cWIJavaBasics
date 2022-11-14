import Objects.CarObject;

import java.util.Scanner;

public class Car {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        CarObject c1 = new CarObject(7,"Audi","A1234",60,60,"green");

        CarObject c2 = new CarObject(7,"Opel","O1234",50,50,"grey");

        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());
        c2.carBreak();
        c2.turboBoost();
        c2.drive();
        System.out.println(c2.getFuelAmount());
        System.out.println("Wie oft moechtest du Hupen?");
        int amountOfRepetitions=scanner.nextInt();
        c2.honk(amountOfRepetitions);
        c2.getRemainingRange();
    }
}
