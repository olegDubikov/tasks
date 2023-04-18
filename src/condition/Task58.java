package condition;

public class Task58 {

    public static void isWinning(int number) {
        String str = String.valueOf(number);
        int num1 = str.charAt(0) + str.charAt(1) + str.charAt(2);
        int num2 = str.charAt(3) + str.charAt(4) + str.charAt(5);
        if (num1 % 2 == 0 && num1 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}