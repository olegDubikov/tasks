package main.list;

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
