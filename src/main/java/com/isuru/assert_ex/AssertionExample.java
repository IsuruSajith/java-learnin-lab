package com.isuru.assert_ex;

public class AssertionExample {
    public static void main(String[] args) {
        int value = 10;

        // Simple assertion
        assert value > 0;

        // Assertion with a message
        assert value > 0 : "Value should be greater than 0";
    }
}

