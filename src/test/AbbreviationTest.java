package test;

import main.loop.Abbreviation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.loop.Abbreviation.collect;

class AbbreviationTest {

    @Test
    void whenABC() {
        Assertions.assertEquals(collect("Abkhh Bdfj Clkkl"), "ABC");
    }

    @Test
    void whenLittleABC () {
        Assertions.assertEquals(collect("asdjf bnju clkok"), "abc");
    }
}