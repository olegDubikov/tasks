package array;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (var i = 0; i < data.length - 1; i++) {
            if (data[i + 1] - data[i] != 1) {
                result = data[i + 1];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(find(arr));
    }
}

/*
Выпал из последовательности
Дана возрастающая последовательность чисел.
Ваша задача проверить, что все числа идут один за другим,
т.е. разница между соседними числами по модулю равно 1.
Если это условие нарушается, то вам нужно вернуть число,
которое идет вторым при нарушении. В противном случае, вернуть -1

Например,

{1, 2, 3} => -1

{1, 3} => 3
 */