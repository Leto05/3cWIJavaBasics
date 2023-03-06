package at.let.sinusrootcalculator;

public class Sinuscalculator extends Calculator
{

    public Sinuscalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double sinus(double number1, double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result= number1/number2;
        return result;
    }

    public double cosinus(double number1, double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = number2/number1;
        return result;
    }
}
