package main.condition;

public class Task71 {

    public static void change(int money) {
        int hundred = 0;
        int fifty = 0;

        int ten;
        for(ten = 0; money >= 100; ++hundred) {
            money -= 100;
        }

        while(money < 100 && money >= 50) {
            money -= 50;
            ++fifty;
        }

        while(money < 50 && money >= 10) {
            money -= 10;
            ++ten;
        }
        System.out.println(money % 10 == 0 ? "100: " + hundred + ", 50: " + fifty + ", 10: " + ten : "Нельзя");
    }

    public static void main(String[] args) {
        change(876543210);
    }
}