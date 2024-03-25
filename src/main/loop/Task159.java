package main.loop;

public class Task159 {
    public static void loop() {
        int a = 1;
        int sum = 0;
        int max = 0;
        int num = 1;
        while (a <= 10000) {
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    sum += i;
                }
            }
            sum += a;
            if (sum > max) {
                max = sum;
                num = a;
            }
            sum = 0;
            a++;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Написать код, который находит и выводит в консоль натуральное число от 1 до 10000
с максимальной суммой делителей.
 */
