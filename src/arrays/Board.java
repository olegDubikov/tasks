package arrays;

public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }

    public static void main(String[] args) {
        int[][] in = {{1}, {2, 3}, {4, 5, 6}};
        System.out.println(getCountRow(in));
        System.out.println(getCountCellInRow(in, 2));
    }
}