package main.array;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (var i = 0; i < 7; i++) {
            if (i < 5) {
                if (hours[i] - 8 <= 0) {
                    sum += hours[i] * 10;
                }
                if (hours[i] - 8 > 0) {
                    sum += 8 * 10 + ((hours[i] - 8) * 15);
                }
            }
            if (i > 4) {
                if (hours[i] - 8 <= 0) {
                    sum += hours[i] * 10 * 2;
                }
                if (hours[i] - 8 > 0) {
                    sum += 8 * (10 * 2) + ((hours[i] - 8) * (15 * 2));
                }
            }
        }
        return sum;
    }
}

/*
Еженедельная зарплата
Метод принимает массив целочисленных значений, при этом каждый элемент массива
означает количество часов, которые работник отработал в каждый день недели.
Работник может работать и в выходные. При этом оплачивается труд следующим образом:

1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.

2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.

3. В выходные дни работодатель платит в два раза больше, как за каждый час
по норме(первые 8 часов), так и за сверхурочные.

Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 */