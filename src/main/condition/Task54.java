package main.condition;

public class Task54 {

    public static void transform(int number) {
        int num1 = Math.abs(number / 100);
        int num2 = Math.abs(number / 10 % 10);
        int num3 = Math.abs(number % 10);
        if (num3 % 2 == 0) {
            if (num1 % 2 == 0) {
                ++num1;
            } else {
                --num1;
            }

            if (num2 % 2 == 0) {
                ++num2;
            } else {
                --num2;
            }

            ++num3;
        } else if (num3 % 2 == 1) {
            if (num1 % 2 == 1 && num1 != 9) {
                ++num1;
            } else if (num1 != 9) {
                --num1;
            }

            if (num2 % 2 == 1 && num2 != 9) {
                ++num2;
            } else if (num2 != 0 && num2 != 9) {
                --num2;
            }

            if (num3 != 9) {
                ++num3;
            }
        }

        System.out.println(number > 0 ? num1 * 100 + num2 * 10 + num3 : -num1 * 100 - num2 * 10 - num3);
    }

    public static void main(String[] args) {
        transform(100);
    }
}