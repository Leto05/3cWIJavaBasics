package at.let.sinusrootcalculator;
import java.lang.Math;

public class Rootcalculator extends Calculator {

    public Rootcalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double rootfunction(double number1, double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = Math.sqrt(number1+number2);
        return result;
    }
}
