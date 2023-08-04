package array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}

/*
Максимальная длина неубывающей последовательности
Если последовательность элементов удовлетворяет условию
Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
Длина последовательности это количество элементов, которые в нее входят.
В массиве таких последовательностей может быть несколько,
вам нужно найти длину максимальной из них.
 */