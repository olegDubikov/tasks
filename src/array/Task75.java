package array;

import java.util.Arrays;
import java.util.StringJoiner;

public class Task75 {
    public static void array(int[] arr) {
        Arrays.sort(arr);
        int[] times = new int[10];
        for (var i = 1; i < 10; i++) {
            for (int k : arr) {
                if (i == k) {
                    times[i] += 1;
                }
            }
        }
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i < 9; i++) {
            joiner.add(i + ": " + times[i] + ",");
        }
        System.out.println(joiner + " 9: " + times[9]);
        int often = 1;
        StringJoiner joinerOften = new StringJoiner(" ");
        StringJoiner joinerNone = new StringJoiner(" ");
        StringJoiner joinerRare = new StringJoiner(" ");
        for (var i = 1; i < times.length; i++) {
            if (times[i] > often) {
                often = times[i];
            } else if (times[i] == times[0]) {
                joinerNone.add(String.valueOf(i));
            } else if (times[i] == 1) {
                joinerRare.add(String.valueOf(i));
            }
        }
        if (often > 1) {
            for (var i = 0; i < times.length; i++) {
                if (times[i] == often) {
                    joinerOften.add(String.valueOf(i));
                }
            }
        }
        if (joinerOften.length() == 0 || joinerRare.length() == 0) {
            System.out.println("Чаще: 0, отсутствует: " + joinerNone + ", реже: 0");
        } else {
            System.out.println("Чаще: " + joinerOften + ", отсутствует: " + joinerNone + ", реже: " + joinerRare);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 2, 7, 8, 7};
        array(arr);
    }
}
//1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0
/*
Определить количество каждой из цифр в массиве
Ниже представлен метод array(int[] arr), который принимает массив целых чисел от 1 до 9.
Цифры могут содержаться в массиве в разном количестве и порядке, а также могут отсутствовать.

Задание: написать код, который определяет следующее:
- Сколько раз каждая из цифр встречается в массиве.

- Какая цифра (цифры) встречается в массиве чаще всего.

- Какая цифра (цифры) вообще не встречается в серии.

- Какая цифра (цифры) встречается в массиве реже всего.

Чаще - это если цифра присутствует больше раз, чем остальные (3, 3, 3, 2, 2, 1 - здесь чаще 3.
А случае 3, 3, 2, 2, 1 - чаще 3 и 2).
Реже - это если цифра присутствует меньше раз, чем остальные, но не менее одной (3, 3, 3, 2, 2, 1 - здесь реже 1).
Если массив состоит из значений только одной цифры, значит она не чаще, и не реже Например (1, 1).
Если массив (1, 1, 2) значит 1 - чаще, 2 - реже.

Результат нужно вывести в консоль в 2 строки. Вывод должен иметь вид:

"1: х, 2: х, 3: х, 4: х, 5: х, 6: х, 7: х, 8: х, 9: х" - первая строка. х - полученные значения.

"Чаще: хуz, отсутствует: хуz, реже: хуz" - вторая строка.
х, у, z - полученные значения без пробела в порядке возрастания.

Если требуемые для вывода цифры отсутствуют, вывести вместо значения ноль.

Например, для массива значений [1, 2, 2, 4, 5, 2, 7, 8, 7] вывод должен быть:

1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0

Чаще: 2, отсутствует: 3 6 9, реже: 1 4 5 8
 */