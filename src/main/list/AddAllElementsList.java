package main.list;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        boolean l = left.contains(str);
        boolean r = right.contains(str);
        if (l && r) {
            left.remove(str);
        }
        left.addAll(right);
        return left.indexOf(str);
    }
}

/*
Задание: метод принимает 2 списка и элемент, который возможно содержится в этих списках.
Вам необходимо проверить оба списка, содержат ли они одновременно этот элемент,
если содержит - необходимо удалить элемент из первого списка.
Потом второй список нужно добавить в первый.
Метод должен вернуть индекс элемента, который пришел в параметрах метода из общего списка.
 */