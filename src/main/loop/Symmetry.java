package main.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean ex = false;
        String str = String.valueOf(i);
        for (var x = 0; x < str.length() / 2; x++) {
            String sStart = String.valueOf(str.charAt(x));
            for (var y = str.length() - 1; y > str.length() / 2; y--) {
                String sEnd = String.valueOf(str.charAt(y));
                if (!sStart.equals(sEnd)) {
                    ex = false;
                    break;
                } else {
                    ex = true;
                }
            }
        }
        return ex;
    }

    public static void main(String[] args) {
        System.out.println(check(123456321));
    }
}
