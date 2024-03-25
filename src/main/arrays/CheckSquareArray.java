package main.arrays;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int[] ints : array) {
            if (ints.length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] in = new int[][]{{4, 5, 5, 3, 6}, {2, 3, 4, 7, 0}, {1, 2, 9, 7, 8}};
        System.out.println(checkArray(in));
    }
}
