package arrays;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int x = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = x;
                x++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rows(5)));

        int[][] arr = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println(arr[4].length);
    }
}
