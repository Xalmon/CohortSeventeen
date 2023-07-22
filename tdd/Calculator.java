package tdd;

public class Calculator {
    double result;
    public static boolean isOff() {
        return true;
    }

    public double result(){
        return result;
    }
    public static void power() {
    }

    public boolean isOn() {
        return true;
    }

    public void add(double firstNumber, double secondNumber)
    {
        result=firstNumber+secondNumber;
    }

    public void subtract(double firstNumber, double secondNumber){
    result = firstNumber - secondNumber;
    }
}
