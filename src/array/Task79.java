package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        HashSet<String> set = new LinkedHashSet<>();
        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    set.add(String.valueOf(nums[i]));
                }
            }
        }
        if (set.size() != 0) {
            for (var s : set) {
                joiner.add(s);
            }
            System.out.println(joiner);
        } else {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1, 5, 4, 2};
        array(arr);
    }
}

/*
Вывести значения, которые встречаются больше одного раза
Ниже представлен метод array(int[] arr), который принимает массив целых чисел.

Задание: написать код, который выводит в консоль через пробел только те значения,
которые встречаются в массиве больше одного раза.

Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
5 3
 */
