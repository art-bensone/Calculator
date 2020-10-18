package com.javamentor.operations;

public class Sub implements Operation {
    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}