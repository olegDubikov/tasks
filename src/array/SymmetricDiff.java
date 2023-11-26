package array;

import java.util.ArrayList;
import java.util.List;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        List<Integer> list = new ArrayList<>(left.length + right.length);
        int count = 0;
        if (left.length < right.length) {
            for (var i : left) {
                list.add(i);
            }
            for (var i : right) {
                list.add(i);
            }
            while (count < left.length) {
                for (var i = left.length; i < list.size(); i++) {
                    if (list.get(count) == list.get(i)) {
                        list.set(count, 0);
                        list.set(i, 0);
                        break;
                    }
                }
                count++;
            }
        } else {
            for (var i : right) {
                list.add(i);
            }
            for (var i : left) {
                list.add(i);
            }
            while (count < right.length) {
                for (var i = right.length; i < list.size(); i++) {
                    if (list.get(count) == list.get(i)) {
                        list.set(count, 0);
                        list.set(i, 0);
                        break;
                    }
                }
                count++;
            }
        }
        int[] arr = list.stream()
                .sorted()
                .filter(i -> i != 0)
                .mapToInt(i -> i).toArray();
        return arr;
    }
}
 /*
 Симметрическая разность множеств
Симметрическая разность - это такая операция, когда в результирующее множество
попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в другом множествах.

Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
Например,
{1}, {2} => {1, 2}
{1, 2}, {2, 3} => {1, 3}
{1}, {} => {1}
  */