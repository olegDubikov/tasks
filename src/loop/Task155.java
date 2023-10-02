package loop;

public class Task155 {
    public static void loop() {
        int sum = 0;
        for (var i = 10; i <= 20; i++) {
            StringBuilder builder = new StringBuilder("Число: " + i + ", сумма делителей: ");
            for (var j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            builder.append(sum);
            System.out.println(builder);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести суммы делителей чисел
Задание: написать код, который выводит в консоль построчно суммы всех делителей чисел
от 10 до 20 (оба включая) в виде "Число: х, сумма делителей: у".
 */