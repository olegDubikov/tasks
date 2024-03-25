package main.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int team1 = 0;
        int team2 = 0;
        for (var i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                team1 += players[i];
            } else {
                team2 += players[i];
            }
        }
        return team1 == team2 ? 0 : team1 > team2 ? 1 : 2;
    }

    public static void main(String[] args) {
        int[] d = {6, 5, 4, 5};
        System.out.println(whoWin(d));
    }
}

/*
Четные vs Нечетные
Вам даны очки игроков. Игроки разделись таким образом,
что под четными индексами находятся очки первой команды,
под нечетными второй. Ваша задача определить, кто выиграл.
Выигрывает та команда, которая набрала наибольшее число очков.
Если выиграла первая команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 */
