package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task80 {

    public static int[] array(int[] nums) {
        List<Integer> list = new ArrayList();
        int[] arr = new int[0];

        for(int i = 0; i < nums.length; ++i) {
            int count = 0;
            int[] var5 = nums;
            int var6 = nums.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                int num = var5[var7];
                if (nums[i] == num) {
                    ++count;
                }

                if (count < 2) {
                    list.add(i);
                    arr = list.stream().mapToInt((x) -> {
                        return x;
                    }).toArray();
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3};
        array(arr);
    }
}