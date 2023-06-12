package loop;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int i = 2;
        while (i <= num) {
            if (num % i == 0) {
                BigInteger bigInteger = BigInteger.valueOf(i);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
                if (probablePrime) {
                    joiner.add(String.valueOf(i));
                }
            }
            i++;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(19);
    }
}

/*
Вывести делители числа, являющиеся простыми числами
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: написать код, который выводит в консоль через пробел делители входящего числа,
являющиеся простыми числами.
Простое число - число, которое имеет только 2 делителя,
то есть делится только на 1 и на себя.
Например, для числа 10 вывод будет:
2 5
 */