package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        List<String> left1 = new ArrayList<>(Arrays.asList(left.split("")));
        List<String> right1 = new ArrayList<>(Arrays.asList(right.split("")));
        for (String s : left1) {
            right1.remove(s);
        }
        return right1.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(eq("Hello", "Haoll"));
    }
}

/*
Проверить две строчки на идентичность.
Даны две строки. Нужно проверить, что вторая строка получилась
методом перестановок символов в первой строке.
 */