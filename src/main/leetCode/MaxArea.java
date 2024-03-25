package main.leetCode;

public class MaxArea {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int sq = 0;
        while (l < r) {
            int sq1 = Math.min(height[l], height[r]) * (r - l);
            sq = Math.max(sq, sq1);
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return sq;
    }

    public static void main(String[] args) {
        int[] arr = {75, 21, 3, 152, 13, 107, 163, 166, 32, 160, 41, 131, 7, 67, 56, 5, 153, 176, 29, 139, 61,
                149, 176, 142, 64, 75, 170, 156, 73, 48, 148, 101, 70, 103, 53, 83, 11, 168, 1, 195, 81, 43, 126,
                88, 62, 134, 45, 167, 63, 26, 107, 124, 128, 83, 67, 192, 158, 189, 149, 184, 37, 49, 85, 107, 152,
                90, 143, 115, 58, 144, 62, 139, 139, 189, 180, 153, 75, 177, 121, 138, 4, 28, 15, 132, 63, 82,
                124, 174, 23, 25, 110, 60, 74, 147, 120, 179, 37, 63, 94, 47};
        MaxArea m = new MaxArea();
        System.out.println(m.maxArea(arr));
    }
}
/*
You are given an integer array height of length n. There are n vertical lines drawn such
that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

Example 2:

Input: height = [1,1]
Output: 1

Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
