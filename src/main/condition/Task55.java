package main.condition;

public class Task55 {

    public static void apartmentPlace(int number) {
        int count;
        for(count = 0; number > 0; ++count) {
            number -= 3;
        }

        System.out.println(count);
        switch (number % 3) {
            case -2:
                System.out.println(1);
                break;
            case -1:
                System.out.println(2);
                break;
            default:
                System.out.println(3);
        }

    }
}