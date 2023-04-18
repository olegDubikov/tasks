package loop;

public class DigitSum {

    public static int sum(int num) {
        int sum;
        for(sum = 0; num > 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }
}