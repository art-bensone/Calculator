package com.javamentor.calculators;

import com.javamentor.calculators.exceptions.DifferentDigitsException;

import java.util.HashMap;
import java.util.Map;

public class RomanCalculator extends AbstractCalculator implements Calculator {
    private static Map<Integer, String> romanDigits = new HashMap<>();

    static {
        romanDigits.put(1, "I");
        romanDigits.put(2, "II");
        romanDigits.put(3, "III");
        romanDigits.put(4, "IV");
        romanDigits.put(5, "V");
        romanDigits.put(6, "VI");
        romanDigits.put(7, "VII");
        romanDigits.put(8, "VIII");
        romanDigits.put(9, "IX");
        romanDigits.put(10, "X");
    }

    @Override
    protected void checkSecondDigit(String b) throws DifferentDigitsException {
        if (!Digits.isRoman(b)) {
            throw new DifferentDigitsException("Digits should be both roman");
        }
    }

    @Override
    protected String convert(int result) {
        return romanDigits.getOrDefault(result, String.valueOf(result));
    }
}
