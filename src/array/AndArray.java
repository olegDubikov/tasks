package array;

import java.util.ArrayList;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
            while (a < right.length) {
                for (int i : left) {
                    if (right[a] == i) {
                        list.add(right[a]);
                    }
                }
                a++;
            }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}

/*
Пересечение множеств
Множество - это набор уникальных элементов.
Пересечение множеств - это такая операция, когда в результирующее
множество попадают только элементы, которые есть в обоих множествах.
Если нет такие элементов, то результат пустое множество.
Ваша задача реализовать данную операцию в коде. Множества заданы массивами
Например,
{1, 2} и {3, 4} => {}, нет общих элементов
{1, 2} и {1, 3, 4} => {1}, 1 общий элемент
{1, 2} и {1, 2, 3, 4} => {1, 2}, 1 и 2 общие элементы
 */
