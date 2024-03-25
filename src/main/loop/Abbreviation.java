package main.loop;

import java.util.StringJoiner;

public class Abbreviation {
    public static String collect(String s) {
        StringJoiner joiner = new StringJoiner("");
        String[] text = s.split(" ");
        for (var t : text) {
            joiner.add(String.valueOf(t.charAt(0)));
        }
         return String.valueOf(joiner);
    }

    public static void main(String[] args) {
        System.out.println(collect("Chief Executive Officer"));
    }
}

/*
Аббревиатуры
Аббревиатуры стали неотъемлемой частью нашей жизни.
Мы очень часто используем и много какие выражения сокращаем,
забирая от каждого слова только первую букву - именно так формируются аббревиатуры.

Метод принимает строку, которая состоит из нескольких слов каждое
из которых начинается с прописной буквы. Необходимо из полученной
строки сформировать аббревиатуру.
 */