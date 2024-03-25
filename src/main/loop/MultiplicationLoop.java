package main.loop;

public class MultiplicationLoop {

    public static int calculate(int a, int n) {
        int count = n;
        int x;
        for(x = 1; count > 0; --count) {
            x *= a;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 2));
    }
}