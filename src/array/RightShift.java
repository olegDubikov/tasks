package array;

import java.util.Arrays;

public class RightShift {
    public static void shift(int[] nums, int count) {
        int length = nums.length - 1;
        if (count == 1) {
            for (var i = 0; i < count; i++) {
                int temp = nums[i];
                nums[i] = nums[length];
                nums[length] = temp;
                for (var j = length; j > i + 1; j--) {
                    int temp1 = nums[j];
                    nums[j] = nums[--j];
                    nums[j] = temp1;
                    j++;
                }
            }
        }
        if (count > 1) {
            int y = 1;
            while (y <= count) {
                int temp = nums[0];
                nums[0] = nums[length];
                nums[length] = temp;
                for (var j = length; j > 1; j--) {
                    int temp1 = nums[j];
                    nums[j] = nums[--j];
                    nums[j] = temp1;
                    j++;
                }
                y++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shift(arr, 9);
    }
}
/*
Циклический сдвиг вправо
Ваша задача выполнить циклический сдвиг вправо с шагом count

Например,

{1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}

{1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */