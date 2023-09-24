package loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 100; i < 1000; i++) {
            if (rev(i) != i && zero(i)) {
                double num = Math.sqrt(i * rev(i));
                if (num == Math.round(num)) {
                    joiner.add(String.valueOf(i));
                }
            }
        }
        System.out.println(joiner);
    }

    private static int rev(int num) {
        int reverseNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        return reverseNumber;
    }

    private static boolean zero(int num) {
        boolean b = true;
        String numberString = String.valueOf(num);
        for (int i = 0; i < numberString.length() - 1; i++) {
            if (numberString.charAt(i) == '0' && numberString.charAt(i + 1) == '0') {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести трехзначные числа при некоторых условиях
Для целого положительного трехзначного числа определим следующие условия:

- Корень 2й степени из произведения данного числа на число,
составленное из тех же цифр в обратном порядке -
должен являться целым числом. (Например, квадратный корень из 144 * 441 = 252)

- Данное число не равно числу, составленному из тех же цифр в обратном порядке.

- Данное число не содержит 2 рядом стоящих нулей.

Например, числом, соответствующим этим условиям, является число 144.

Задание: Написать код, который выводит в консоль через пробел все целые трехзначные числа,
которые удовлетворяют условиям выше.

Вывод должен выглядеть так:

144 169 288 441 528 768 825 867 882 961
 */
