package com.javamentor.calculators;

import com.javamentor.calculators.exceptions.DifferentDigitsException;
import com.javamentor.calculators.exceptions.UnsupportedDigitException;
import com.javamentor.operations.Operation;

import static com.javamentor.calculators.Digits.checkValue;
import static com.javamentor.operations.Operations.checkOperation;

public abstract class AbstractCalculator implements Calculator {

    protected abstract void checkSecondDigit(String a) throws DifferentDigitsException;
    protected abstract String convert(int result);

    @Override
    public String calculate(String a, String b, String operation) throws UnsupportedDigitException, UnsupportedOperationException, DifferentDigitsException {
        checkSecondDigit(b);
        Digits.Value x = checkValue(a);
        Digits.Value y = checkValue(b);
        Operation operationXY = checkOperation(operation);
        return convert(operationXY.execute(x.value, y.value));
    }
}
