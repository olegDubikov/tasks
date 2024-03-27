package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.loop.Task172.checkStrings;

class Task172Test {

    @Test
    void whenCheckLineZero() {
        Assertions.assertEquals(checkStrings("11111", "11111"), 0);
    }

    @Test
    void whenCheckLineTwo() {
        Assertions.assertEquals(checkStrings("01234", "01430"), 2);
    }

    @Test
    void whenAllSimbolDefferent() {
        Assertions.assertEquals(checkStrings("00000", "11111"), 5);
    }
}