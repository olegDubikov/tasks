package loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int num = 300;
        while (num < 326) {
            int dec = num % 100;
            int n = num / 100;
            if (dec > 9) {
                boolean b = dec % n == 0;
                if (b) {
                    joiner.add(String.valueOf(num));
                }
            }
            num++;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Написать код, который выводит в консоль через пробел все целые числа от 300 до 325,
в которых две последних цифры (десятков и единиц) образуют двузначное число,
делящееся без остатка на первую цифру (сотен)
Вывод должен выглядеть так:

312 315 318 321 324
 */
