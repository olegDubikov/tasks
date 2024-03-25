package main.array;

public class Initials {
    public static String convert(String[] fio) {
        return fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0) + ".";
    }

    public static void main(String[] args) {
        String[] w = {"Иванов", "Иван", "Иваныч"};
        System.out.println(convert(w));
    }
}

/*
Инициалы
Дан массив из трех элементов. В нем записаны соответственно
Фамилия Имя Отчество. Ваша задача получить инициалы.

Например,

"Иванов", "Роман", "Иваныч" -> "Иванов Р.И."
 */