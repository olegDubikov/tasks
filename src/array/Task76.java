package array;

public class Task76 {
    public static void array(int[] arr) {
        int[] grade = new int[5];
        int count = 0;
        int j = 5;
        while (j > 0) {
            for (int a : arr) {
                if (a == j) {
                    count++;
                }
            }
            j--;
            grade[j] = count;
            count = 0;
        }
        System.out.println("5: " + grade[4] + ", 4: " + grade[3]
                + ", 3: " + grade[2] + ", 2: "
                + grade[1] + ", 1: " + grade[0]);
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1};
        array(arr);
    }
}

/*
Посчитать количество учеников, получивших оценки
Ниже представлен метод array(int[] arr), который принимает
массив целых чисел - оценки учеников (могут быть от 1 до 5).

Задание: написать код, который выводит в консоль информацию
о распределении оценок в виде: "5: х, 4: х, 3: х, 2: х, 1: х",
где х - количество учеников, получивших данную оценку.

Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:

5: 2, 4: 1, 3: 2, 2: 0, 1: 1
 */
