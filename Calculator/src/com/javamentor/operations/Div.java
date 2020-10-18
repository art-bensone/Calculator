package com.javamentor.operations;

public class Div implements Operation {
    @Override
    public int execute(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return x / y;
    }
}