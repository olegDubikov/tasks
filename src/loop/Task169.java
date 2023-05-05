package loop;

import java.util.Scanner;

public class Task169 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        for (int i = 0; i < columnCount; ++i) {
            for (int j = 0; j < columnCount; ++j) {
                boolean stars = j >= i && j <= columnCount - 1 - i || j <= i && j >= columnCount - 1 - i;
                boolean spaces = i > j;
                if (stars) {
                    System.out.print(star);
                } else if (spaces) {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}