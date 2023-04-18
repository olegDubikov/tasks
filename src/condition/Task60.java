package condition;

public class Task60 {

    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        }
        if (a != b && b != c && a != c) {
            System.out.println("Равных нет");
        } else if (a > b && b == c) {
            System.out.println("Второе и третье равны, первое больше");
        } else if (a < b && b == c) {
            System.out.println("Второе и третье равны, первое меньше");
        } else if (b > a) {
            System.out.println("Первое и третье равны, второе больше");
        } else if (b < a) {
            System.out.println("Первое и третье равны, второе меньше");
        } else if (c > b) {
            System.out.println("Первое и второе равны, третье больше");
        } else if (c < b) {
            System.out.println("Первое и второе равны, третье меньше");
        }
    }
}