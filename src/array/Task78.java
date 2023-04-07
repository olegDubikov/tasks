package array;

import java.util.StringJoiner;

public class Task78 {

    public static void array(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int[] var2 = nums;
        int var3 = nums.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            int count = 0;
            int[] var7 = nums;
            int var8 = nums.length;

            for (int var9 = 0; var9 < var8; ++var9) {
                int i = var7[var9];
                if (num == i) {
                    ++count;
                }
            }

            if (count < 2) {
                joiner.add(String.valueOf(num));
            }
        }

        if (joiner.length() == 0) {
            System.out.print("");
        } else {
            System.out.println(joiner);
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        array(nums);
    }
}
