package array;

import java.util.Arrays;
import java.util.HashSet;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        HashSet<Integer> hs = new HashSet<>();
        for (var i : left) {
            hs.add(i);
        }
        for (var i : right) {
            hs.add(i);
        }
        int[] arr = hs.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1};
        System.out.println(Arrays.toString(or(a, b)));
    }
}

/*
Объединение множеств
Объединение множеств это такая операция при которой в результирующее
множество попадают элементы, которые есть хотя бы в одном множестве.

Ваша задача реализовать эту операцию. Множества заданы в виде массива
Например,
{1}, {2} => {1, 2}
{1, 2}, {2} => {1, 2}
{1, 2}, {3} => {1, 2, 3}
{1}, {} => {1}
 */