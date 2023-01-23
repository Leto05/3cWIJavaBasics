package at.let;

import at.let.Objects.CarObject;
import at.let.Objects.Engine;
import at.let.Objects.Fuel;
import at.let.Objects.RearMirror;

import java.util.Scanner;

public class Car {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL );
        Engine e2 = new Engine(120, Engine.TYPE.GAS );
        Fuel f1 = new Fuel(60,60);
        Fuel f2 = new Fuel(45,50);
        RearMirror m1 = new RearMirror(3,1);
        RearMirror m2 = new RearMirror(3,2);

        CarObject c1 = new CarObject(m1,f1,e1,5,"Audi","A1234","green");

        CarObject c2 = new CarObject(m2,f2,e2,5,"Opel","O1234","grey");

        System.out.println(c2.getFuel().getFuelAmount());
        System.out.println("Mit welcher Power fahren?");
        int power=scanner.nextInt();
        c2.drive(power);
        System.out.println(c2.getFuel().getFuelAmount());
        c2.carBreak();
        c2.turboBoost();
        c2.drive(power);
        System.out.println(c2.getFuel().getFuelAmount());
        System.out.println("Wie oft moechtest du Hupen?");
        int amountOfRepetitions=scanner.nextInt();
        c2.honk(amountOfRepetitions);
        c2.getRemainingRange();
    }
}
