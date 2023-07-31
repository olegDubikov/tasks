package array;

public class WordsToText {
    public static String convert(String[] words) {
        String result;
        StringBuilder builder = new StringBuilder();
        for (var w : words) {
            builder.append(w).append(" ");
        }
        result = String.valueOf(builder);
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        String[] w = {"Hello", "World"};
        System.out.println(convert(w));
    }
}

/*
Объединение слов
Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.

Например,

{"one", "two", "three"} => "one two three"
 */