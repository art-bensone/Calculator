package com.javamentor.calculators;

import com.javamentor.calculators.exceptions.DifferentDigitsException;

public class ArabCalculator extends AbstractCalculator implements Calculator {

    @Override
    protected void checkSecondDigit(String b) throws DifferentDigitsException {
        if (!Digits.isArab(b)) {
            throw new DifferentDigitsException("Digits should be both arabic (Zero is not supported)");
        }
    }
    @Override
    protected String convert(int result) {
        return String.valueOf(result);
    }
}
