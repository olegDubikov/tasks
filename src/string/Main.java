package string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
        if (y < 3.0 * x && y > 2.0 * x) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}