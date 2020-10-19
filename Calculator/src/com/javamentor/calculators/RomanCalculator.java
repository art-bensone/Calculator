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
        romanDigits.put(11, "XI");
        romanDigits.put(12, "XII");
        romanDigits.put(13, "XIII");
        romanDigits.put(14, "XIV");
        romanDigits.put(15, "XV");
        romanDigits.put(16, "XVI");
        romanDigits.put(17, "XVII");
        romanDigits.put(18, "XVIII");
        romanDigits.put(19, "XIX");
        romanDigits.put(20, "XX");
        
        romanDigits.put(21, "XXI");
        romanDigits.put(24, "XXIV");
        romanDigits.put(27, "XXVII");
        romanDigits.put(28, "XXVIII");
        romanDigits.put(32, "XXXII");
        romanDigits.put(35, "XXXV");
        romanDigits.put(36, "XXXVI");
        romanDigits.put(42, "XLII");
        romanDigits.put(45, "XLV");
        romanDigits.put(48, "XLVIII");
        romanDigits.put(49, "XLIX");
        romanDigits.put(54, "LIV");
        romanDigits.put(56, "LVI");
        romanDigits.put(63, "LXIII");
        romanDigits.put(64, "LXIV");
        romanDigits.put(72, "LXXII");
        romanDigits.put(81, "LXXXI");
        
        romanDigits.put(30, "XXX");
        romanDigits.put(40, "XL");
        romanDigits.put(50, "L");
        romanDigits.put(60, "LX");
        romanDigits.put(70, "LXX");
        romanDigits.put(80, "LXXX");
        romanDigits.put(90, "XC");
        romanDigits.put(100, "C");
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
