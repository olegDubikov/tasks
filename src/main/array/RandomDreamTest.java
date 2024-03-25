package main.array;

public class RandomDreamTest {
    public static String random(String[] prizes, int num) {
        return num % prizes.length == 0 ? prizes[prizes.length - 1] : prizes[(num % prizes.length) - 1];
    }

    public static void main(String[] args) {
        String[] prizes = {"car", "ticket", "flat", "house"};
        System.out.println(random(prizes, 5));
    }
}
