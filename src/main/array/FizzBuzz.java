package main.array;

public class FizzBuzz {
    public byte[] fizzbuzz(int value) {
        String res = "";
        if (value % 3 == 0) {
            res += "Fizz";
        }
        if (value % 5 == 0) {
            res += "Buzz";
        }
        if (res.length() == 0) {
            throw new IllegalArgumentException("value not found");
        }
        return res.getBytes();
    }
}