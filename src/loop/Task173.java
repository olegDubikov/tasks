package loop;

public class Task173 {

    public static String code(String s) {
        String s1 = "empty";
        if (s.length() == 0) {
            return s1;
        } else if (s.length() <= 4) {
            return s;
        } else {
            char[] arr = s.toCharArray();
            for (int i = 0; i < s.length() - 4; ++i) {
                arr[i] = '#';
            }
            s = String.valueOf(arr);
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(code("123456464775616"));
    }
}