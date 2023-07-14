package tdd;


public class Multiplication {

    public int multiply(int firstNumber, int secondNumber) {
        int result = 0;
        for (int number = 0; number < secondNumber; number++) {
            result += firstNumber;
        }
        return result;
    }
}