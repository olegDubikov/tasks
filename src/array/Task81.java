package array;

import java.util.Arrays;

public class Task81 {
    public static int[] array(int[] nums) {
        int minus = 0;
        int zero = 0;
        int plus = 0;
        for (var num : nums) {
            if (num < 0) {
                minus++;
            }
            if (num == 0) {
                zero++;
            }
            if (num > 0) {
                plus++;
            }
        }
        return new int[]{minus, zero, plus};
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        System.out.println(Arrays.toString(array(arr)));
    }
}
