package concat;

public class JoinExample {
    public JoinExample() {
    }

    public static void main(String[] args) {
        String str = String.join(" ", "abc", "def", "ghi");
        System.out.println(str);
    }
}