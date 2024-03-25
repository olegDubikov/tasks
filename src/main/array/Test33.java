package main.array;

import java.util.Deque;
import java.util.LinkedList;

public class Test33 {
    Deque<Integer> deque = new LinkedList();

    public Test33() {
    }

    void init(int x) {
        this.deque.addFirst(x);
    }
}