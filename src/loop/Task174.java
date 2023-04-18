package loop;

public class Task174 {

    public static void isPalindrome(int number) {
        int reverted = number % 10;
        if (reverted == 0) {
            System.out.println("Нет");
        } else {
            int num;
            int revNext;
            for (num = number / 10; num > reverted; reverted = 10 * reverted + revNext) {
                revNext = num % 10;
                num /= 10;
            }
            System.out.println(num != reverted && num != reverted / 10 ? "Нет" : "Да");
        }
    }

    public static void main(String[] args) {
        isPalindrome(2);
    }
}