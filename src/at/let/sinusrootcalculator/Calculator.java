package at.let.sinusrootcalculator;

public class Calculator {

    double number1;
    double number2;

    public Calculator(double number1, double number2)
    {
        this.number1=number1;
        this.number2=number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double add(double number1, double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = number1 + number2;
        return result;
    }

    public double subtract(double number1,double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = number1 - number2;
        return result;
    }

    public double multiply(double number1,double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = number1 * number2;
        return result;
    }

    public double divide(double number1,double number2)
    {
        this.number1=number1;
        this.number2=number2;
        double result = number1 / number2;
        return result;
    }
}
