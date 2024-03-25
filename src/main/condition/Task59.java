package main.condition;

public class Task59 {

    public static void getLinearEquation(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        }

        if (a == 0 && b != 0) {
            System.out.println("Нет решения");
        }

        if (a != 0 && b % a != 0) {
            double x = (double)(-b) / (double)a;
            System.out.println(x);
        }

        if (a != 0 && b % a == 0) {
            System.out.println(-b / a);
        }

    }

    public static void main(String[] args) {
        getLinearEquation(0, 0);
    }
}