package main.condition;

public class Task56 {

    public static void isTriangle(int a, int b, int c) {
        if (a <= b + c && b <= a + c && c <= a + b) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}