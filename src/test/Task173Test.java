package test;

import main.loop.Task173;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task173Test {
    @Test
    void whenLineLessZero() {
        Assertions.assertEquals(Task173.code(""), "empty");
    }

    @Test
    void whenLineEqualsFour () {
        Assertions.assertEquals(Task173.code("3567"), "3567");
    }

    @Test
    void whenLineMoreFour () {
        Assertions.assertEquals(Task173.code("125873567"), "#####3567");
    }
}