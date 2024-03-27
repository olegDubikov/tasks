package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static main.list.CheckerAhdGetter.getElement;

class CheckerAhdGetterTest {

    @Test
    void whenListEmpty() {
        List<String> list = List.of("");
        Assertions.assertEquals(getElement(list), "");
    }

    @Test
    void whenListContainsElement() {
        List<String> list = List.of("bread", "salt", "milk");
        Assertions.assertEquals(getElement(list), "bread");
    }
}