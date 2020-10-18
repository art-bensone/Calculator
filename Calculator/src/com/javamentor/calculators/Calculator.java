package com.javamentor.calculators;

import com.javamentor.calculators.exceptions.DifferentDigitsException;
import com.javamentor.calculators.exceptions.UnsupportedDigitException;

public interface Calculator {
    String calculate(String a, String b, String operation) throws UnsupportedDigitException, UnsupportedOperationException, DifferentDigitsException;
}
