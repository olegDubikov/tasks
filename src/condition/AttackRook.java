package condition;

public class AttackRook {

    public static boolean check(String left, String right) {
        boolean ch = left.toCharArray()[0] == right.toCharArray()[0] || left.toCharArray()[1] == right.toCharArray()[1];
        return ch;
    }

    public static void main(String[] args) {
        check("A9", "B8");
    }
}