package condition;

public class Task53 {

    public static void transformFraction(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Подсчет не производится");
        }

        if (num1 > num2) {
            int num = num1 / num2;
            int chislitel = num1 % num2;
            if (chislitel > 0) {
                System.out.println("" + num + " " + chislitel + "/" + num2);
            } else {
                System.out.println(num);
            }
        }

        if (num1 == num2) {
            System.out.println(1);
        }

    }
}