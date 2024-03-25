package main.condition;

public class PairsCharString {

    public static boolean check(String l, String r) {
        if (l.length() == 0 && r.length() == 0) {
            System.out.println("empty");
            return true;
        } else if (l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0)) {
            System.out.println("yes");
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    public static void main(String[] args) {
        check("asda", "asvmra");
    }
}