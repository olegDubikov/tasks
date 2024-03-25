package main.array;

import java.util.ArrayList;

public class NumberToArray {
    public static int[] resolve(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (number > 0) {
            i = number % 10;
            arrayList.add(i);
            number /= 10;
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*
Массив цифр
Дано число int. Нужно получить массив из его цифр в обратном порядке.
Например
12345 => {5, 4, 3, 2, 1}
 */
