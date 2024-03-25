package main.list;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String s = "";
        if (!list.isEmpty()) {
            s = list.iterator().next();
        }
        return s;
    }
}

/*
Задание: вам необходимо реализовать метод, который будет возвращать
первую строку из коллекции строк, но прежде чем получить результат -
необходимо проверить содержатся ли элементы в списке.
Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции.
 */
