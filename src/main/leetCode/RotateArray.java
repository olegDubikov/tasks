package main.leetCode;

import java.util.Arrays;

class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (k == 1) {
            int temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        } else {
            k %= nums.length;
            int[] tempArray = Arrays.copyOf(nums, nums.length);
            System.arraycopy(nums, 0, nums, k, nums.length - k);
            System.arraycopy(tempArray, nums.length - k, nums, 0, k);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 10);
    }
}
/*
Циклический сдвиг вправо
Ваша задача выполнить циклический сдвиг вправо с шагом count

Например,

{1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}

{1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */