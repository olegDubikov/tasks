package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.list.UniqueElement.checkList;

class UniqueElementTest {

    @Test
    void whenUniqueElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Assertions.assertTrue(checkList(list, "two"), String.valueOf(true));
    }

    @Test
    void whenUniqueElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");
        Assertions.assertFalse(checkList(list, "two"), String.valueOf(false));
    }

    @Test
    void whenElementNotFound() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Assertions.assertFalse(checkList(list, "five"), String.valueOf(false));
    }
}