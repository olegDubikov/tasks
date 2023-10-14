package loop;

public class Task48 {
    public static void loop(int num) {
        int x = 1;
        StringBuilder builder = new StringBuilder();
        while (x < num) {
                builder.append(x).append("+");
            x++;
        }
        builder.append(num);
        System.out.println(builder);
    }
}

/*
Вывести серию чисел от 1 до N с разделителем
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль серию чисел от 1 до входящего числа (включительно).
Числа при выводе должны разделяться знаком "+".

Например, для числа 5 вывод будет:
1+2+3+4+5
 */