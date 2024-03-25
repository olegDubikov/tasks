package main.array;

import java.util.ArrayList;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (var l : left) {
            for (var r = 0; r < right.length; r++) {
                if (l == right[r]) {
                    count = 0;
                    break;
                } else if (l != right[r]) {
                    count++;
                }
                if (count == right.length && l != right[r]) {
                    list.add(l);
                    count = 0;
                }
            }
        }
        return right.length == 0 ? left : list.stream().mapToInt(Integer::intValue).toArray();
    }
}