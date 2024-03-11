package loop;

public class Task149 {
    public static void loop(int[] grades) {
        double avg = 0;
        int count = 0;
        for(var grade : grades) {
            if(grade < 6 && grade > 0) {
                avg += grade;
                count++;
            } else {
                break;
            }
        }
        avg = avg/count;
        System.out.printf("%.2f%n", avg);
    }
}

/*
Задание: Написать код, который подсчитывает и выводит
в консоль средний балл этих оценок.
Подсчет заканчивается, когда очередное число в массиве
не является оценкой (не входит в 1-5). Результат нужно
округлить с точностью до 2 символов после точки с помощью String.format("%.2f, avg).

Например, для входящих значений [2, 5, 3, 5, 6, 3, 4] вывод должен быть:
3.75
 */