package main.loop;

import java.io.PrintStream;
import java.util.StringJoiner;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        joiner(first);
        joiner(second);
        joiner(third);
        PrintStream var10000 = System.out;
        int var10001 = count(avg(first), avg(second), avg(third));
        var10000.println("Выше 4.5: " + var10001 + ", наивысшая: " + Math.max(avg(first), Math.max(avg(second), avg(third))));
    }

    public static void joiner(int[] arr) {
        StringJoiner joinNames = new StringJoiner(" ");
        int[] var2 = arr;
        int var3 = arr.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            String str = Integer.toString(i);
            joinNames.add(str);
        }

        System.out.println("Оценки: " + joinNames + ", средняя: " + avg(arr));
    }

    public static double avg(int[] arr) {
        int num = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int number = var2[var4];
            num += number;
        }

        return (double) num / 5.0;
    }

    public static int count(double first, double second, double third) {
        int count = 0;
        if (first > 4.5) {
            ++count;
        }

        if (second > 4.5) {
            ++count;
        }

        if (third > 4.5) {
            ++count;
        }

        return count;
    }

    public static void main(String[] args) {
        loop(new int[]{5, 5, 4, 4, 5}, new int[]{3, 5, 5, 5, 5}, new int[]{3, 3, 5, 5, 5});
    }
}

/*
167. Посчитать средний балл оценок учеников за год
Ниже представлен метод loop(int[] first, int[] second, int[] third), который принимает 3
массива целых положительных чисел - оценки 3 учеников по 5 предметам за год.

Задание: написать код, который подсчитывает среднюю годовую оценку каждого ученика по 5 предметам.
Результат вывести в отдельной строке для каждого ученика в виде: "Оценки: х1 х2 х3 х4 х5, средняя: у".
После построчного вывода оценок для каждого ученика вывести в отдельной строке количество учеников,
у которых среднегодовая оценка выше 4.5, и наивысшую среднегодовую оценку в виде: "Выше 4.5: х, наивысшая: у".

Например, для входящих значений [5, 4, 3, 5, 5], [2, 4, 3, 5, 4], [5, 5, 5, 4, 5] вывод будет:

Оценки: 5 4 3 5 5, средняя: 4.4

Оценки: 2 4 3 5 4, средняя: 3.6

Оценки: 5 5 5 4 5, средняя: 4.8

Выше 4.5: 1, наивысшая: 4.8
 */