package at.let;

import java.util.Random;

public class IfStatement
{
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int number2 = random.nextInt(100);

        System.out.println(number);
        System.out.println(number2);


        if (number < 50 && number != 50)
        {
            System.out.println("Erste Zahl klein, zweite kein 50ger");
        }
        if (number < 30 || number2 < 30) {
            System.out.println("Eine der beiden Zahlen ist kleiner als 30");
        }
        if (number < number2 && number < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }
    }
}
