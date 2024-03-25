package main.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class T {
    public static int[] diff(int[] left, int[] right) {
        List<Integer> list = new ArrayList<>();
        if (left.length > 0) {
            removeDuplicates(list, left);
        }
        if (right.length > 0) {
            removeDuplicates(list, right);
        }
        int[] arr = list.stream()
                .sorted()
                .mapToInt(i -> i)
                .toArray();
        return arr;
    }

    private static void removeDuplicates(List<Integer> list, int[] array) {
        list.addAll(Arrays.stream(array).boxed().collect(Collectors.toList()));
        list.removeAll(new HashSet<>(list));
    }
}