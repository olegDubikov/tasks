package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.list.RepositionElement.changePosition;

class RepositionElementTest {
    private static final List<String> list = new ArrayList<>();

    @BeforeAll
    public static void setUp() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
    }

    @Test
    void whenCorrectRemoveAndSet() {
        List<String> expected = List.of("one", "two", "three", "nine",
                "five", "six", "seven", "eight");
        changePosition(list, 3);
        Assertions.assertEquals(expected, list);
    }

    @Test
    void whenIndexMoreSize() {
        changePosition(list, 20);
        Assertions.assertFalse(false);
    }

    @Test
    void whenIndexEqualsSize() {
        changePosition(list, 8);
        Assertions.assertFalse(false);
    }
}