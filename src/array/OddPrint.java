package array;

public class OddPrint {
    public static void print(int[] array) {
        for (var arr : array) {
            if (arr % 2 == 1) {
                System.out.println(arr);
            }
        }
    }
}

/*
Вывести нечетные в порядке возрастания индексов
Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве нечетные числа
в порядке возрастания их индексов. Для вывода использовать System.out.println()
 */