package main.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        List<String> origin1 = new ArrayList<>(Arrays.asList(origin.split("[ .,:!]+")));
        List<String> line1 = new ArrayList<>(Arrays.asList(line.split(" ")));
        for (String s1 : origin1) {
            line1.remove(s1);
        }
        return line1.size() == 0;
    }

    public static void main(String[] args) {
        String origin = "Мой дядя самых честных правил, " +
                "Когда не в шутку занемог, " +
                "Он уважать себя заставил " +
                "И лучше выдумать не мог. " +
                "Его пример другим наука; " +
                "Но, боже мой, какая скука " +
                "С больным сидеть и день и ночь, " +
                "Не отходя ни шагу прочь! " +
                "Какое низкое коварство " +
                "Полуживого забавлять, " +
                "Ему подушки поправлять, " +
                "Печально подносить лекарство, " +
                "Вздыхать и думать про себя: " +
                "Когда же черт возьмет тебя!";
        String line = "Мой дядя мог думать про тебя и день и ночь";
        System.out.println(generateBy(origin, line));
    }
}

/*
Генератор текста
Задан большой текст. Из него вырезают слова и предложения. Из них составляют новый текст.

Нужно проверить, что новый текст был получен из оригинального.
 */