package main.leetCode;

public class Revers {
    public static int reverse(int x) {
        int a = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        String s = String.valueOf(a);
        String s1 = String.valueOf(reversed);
        return a > 0 && reversed < 0 || a < 0 && reversed > 0
                || a > 0 && (s.charAt(s.length() - 1) != s1.charAt(0) && a % 10 != 0)
                || a < 0 && (s.charAt(s.length() - 1) != s1.charAt(1) && a % 10 != 0) ? 0 : reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range
[-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers
(signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21 */
