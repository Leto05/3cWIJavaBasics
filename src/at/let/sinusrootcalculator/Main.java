package at.let.sinusrootcalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter 2 numbers. Then press '1' to show the basic Math. Press '2' to show sin and cos of an angle, and press '3' to show the square root of the two numbers");
        Scanner scanner = new Scanner(System.in);
        double number1= scanner.nextDouble();
        double number2= scanner.nextDouble();
        int input = scanner.nextInt();

        if (input==1)
        {
            Calculator c1 = new Calculator(number1,number2);
            System.out.println(c1.add(number1,number2));
            System.out.println(c1.subtract(number1,number2));
            System.out.println(c1.multiply(number1,number2));
            System.out.println(c1.divide(number1,number2));
        }
        else if (input==2)
        {
            Sinuscalculator s1 = new Sinuscalculator(number1,number2);
            System.out.println(s1.sinus(number1, number2));
            System.out.println(s1.cosinus(number1,number2));
        }
        else if (input==3)
        {
            Rootcalculator r1 = new Rootcalculator(number1, number2);
            System.out.println(r1.rootfunction(number1, number2));
        }
        else {
            System.out.println("invalid input");
        }

    }
}
