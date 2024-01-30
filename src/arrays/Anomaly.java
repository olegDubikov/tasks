package arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[1][2];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (var i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                sb.append(i);
                count++;
            }
        }
        if(count == 1) {

        }
        return Arrays.copyOf(result, count);
    }
}

/*
Аномалии
Назовем аномалиями диапазоны индексов, на которых значения массива меньше
или равно down или больше или равно up.
Ваша задача найти все аномалии в массиве.
Если в аномалии одно, число то нужно вернуть диапазон
[i, i] - где i индекс числа выходящего за границы.
Например,
{5, 10, 15}, up = 16, down = 4 => аномалий нет
{5, 4, 15}, up = 16, down = 4 => {{1, 1}}
{5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
{5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
 */