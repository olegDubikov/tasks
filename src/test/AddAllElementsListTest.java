package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.list.AddAllElementsList.containsElement;

class AddAllElementsListTest {


    @Test
    void whenElementContainsToLists() {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        left.add("1");
        left.add("2");
        left.add("3");
        right.add("4");
        right.add("5");
        right.add("3");
        String el = "3";
        int expected = containsElement(left, right, el);
        Assertions.assertEquals(expected, 4);
    }

    @Test
    void whenElementNotContainsToListLeft() {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        left.add("1");
        left.add("2");
        left.add("3");
        right.add("4");
        right.add("5");
        right.add("6");
        String el = "5";
        int expected = containsElement(left, right, el);
        Assertions.assertEquals(expected, 4);
    }

    @Test
    void whenElementNotContainsToList() {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        left.add("1");
        left.add("2");
        left.add("3");
        right.add("4");
        right.add("5");
        right.add("6");
        String el = "7";
        int expected = containsElement(left, right, el);
        Assertions.assertEquals(expected, -1);
    }
}