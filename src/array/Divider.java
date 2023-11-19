package array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        boolean b = true;
        for (var i : ints) {
            if (num % i != 0) {
                b = false;
                break;
            }
        }
        return b;
    }
}

/*
Кратность числа
Метод принимает два параметра:
1. Целочисленное значение num;
2. Массив целочисленных значений ints.
Необходимо проверить являются ли все элементы массива ints,
делителями числа num, если являются - то метод должен вернуть true.
 */