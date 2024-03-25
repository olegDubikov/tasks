package main.loop;

public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            StringBuilder line = new StringBuilder(String.valueOf(i));
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    line.append("+");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        loop(20);
    }
}

/*
Графически изобразить делимость чисел
Ниже представлен метод loop(int num), который принимает целое положительное число.
Задание: Написать код, который графически изображает делимость чисел от 1 до num.
Вывести в консоль построчно эти числа с количеством плюсов, равным количеству делителей этого числа.
Единица и само число тоже являются делителями.

Например, для входящего числа 4 вывод будет:
1+
2++
3++
4+++
 */
