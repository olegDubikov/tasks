package main.type;

public class Task45 {

    public static void leftNumChange(int number1, int number2) {
        int first1 = number1 / 100 * 100;
        int first2 = number2 / 100 * 100;
        int num1 = number1 % 100 + number2 / 100 * 100;
        int num2 = number2 % 100 + number1 / 100 * 100;
        System.out.println("" + num1 + "\n" + num2);
    }
}