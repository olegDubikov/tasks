package test;

import main.array.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void whenValueThreeZero() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(3), "Fizz".getBytes());
    }

    @Test
    void whenValueFiveZero() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(5), "Buzz".getBytes());
    }

    @Test
    void whenValueThreeAndFiveZero() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(15), "FizzBuzz".getBytes());
    }

    @Test
    void whenValueException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzbuzz(1));
    }
}