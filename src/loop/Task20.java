package loop;

import java.util.StringJoiner;

public class Task20 {

    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 1550; i >= 1050; --i) {
            if (i % 100 == 0) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println("Начало");
        System.out.println(joiner);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести четырехзначные положительные числа в убывающем порядке
Задание: Написать код, который выводит в консоль через пробел в порядке
убывания все четырехзначные числа от 1050 до 1550, оканчивающиеся на 00.
Перед началом вывода нужно вывести слово "Начало" в отдельной строке,
а после окончания вывода чисел - слово "Конец", тоже в отдельной строке.

Вывод должен получиться такой:
Начало

1500 1400 1300 1200 1100

Конец
 */