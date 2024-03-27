package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static main.list.AddIndexElement.addNewElement;

class AddIndexElementTest {


    @Test
    void whenNotAddElement() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Assertions.assertFalse(addNewElement(list, 2, "1"), String.valueOf(false));
    }

    @Test
    void whenAddElement() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Assertions.assertTrue(addNewElement(list, 2, "5"), String.valueOf(true));
    }
}