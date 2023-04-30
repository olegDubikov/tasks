package loop;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int[] arr1 = Integer.toString(num1).chars().map((c) -> c - 48).toArray();
        int[] arr2 = Integer.toString(num2).chars().map((c) -> c - 48).toArray();
        int[] arr3 = Integer.toString(num3).chars().map((c) -> c - 48).toArray();
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = arr3.length;
        System.out.println("Цифр: " + size1 + ", сумма цифр: " + sum(arr1) + ", делителей: " + divider(num1));
        System.out.println("Цифр: " + size2 + ", сумма цифр: " + sum(arr2) + ", делителей: " + divider(num2));
        System.out.println("Цифр: " + size3 + ", сумма цифр: " + sum(arr3) + ", делителей: " + divider(num3));
        int sumAll = sum(arr1) + sum(arr2) + sum(arr3);
        System.out.println("Сумма всех цифр: " + sumAll);
    }

    public static int sum(int[] arr) {
        int x = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            x += i;
        }

        return x;
    }

    public static int divider(int num) {
        int div = 0;

        for(int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                ++div;
            }
        }

        return div;
    }

    public static void main(String[] args) {
        loop(3, 20, 115);
    }
}

/*
168. Произвести операции с входящими числами
Ниже представлен метод loop(int num1, int num2, int num3), который принимает 3 целых положительных числа.

Задание: написать код, который считает для каждого из входящих чисел: число цифр в числе,
сумму цифр числа и число его делителей. Результат вывести построчно в виде:
"Цифр: х, сумма цифр: у, делителей: z". После этого вывести в отдельной строке
сумму всех цифр всех входящих чисел в виде: "Сумма всех цифр: х".

Например, для чисел 10, 5, 212 вывод будет:

Цифр: 2, сумма цифр: 1, делителей: 4

Цифр: 1, сумма цифр: 5, делителей: 2

Цифр: 3, сумма цифр: 5, делителей: 6

Сумма всех цифр: 11
 */