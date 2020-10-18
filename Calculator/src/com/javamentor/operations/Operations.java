package com.javamentor.operations;

import com.javamentor.calculators.exceptions.UnsupportedDigitException;

import java.util.HashMap;
import java.util.Map;

public class Operations {
    private static Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("+", new Add());
        operations.put("-", new Sub());
        operations.put("/", new Div());
        operations.put("*", new Mul());
    }

    public static Operation checkOperation(String operation) throws UnsupportedOperationException {
        Operation oper = operations.get(operation);
        if (oper == null) {
            throw new UnsupportedOperationException("Operation " + operation + " is not supported");
        } else {
            return oper;
        }
    }
}
