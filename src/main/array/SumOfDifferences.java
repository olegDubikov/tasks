package main.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (var i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1};
        System.out.println(sum(arr));
    }
}

/*
Сумма разниц
Дан массив чисел, нужно найти сумму разниц пар элементов

Например,

{3, 2, 1} => (3 - 2) + (2 - 1) = 2

{15, 10, 5} => (15 - 10) + (10 - 5) => 10
 */