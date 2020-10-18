package com.javamentor.calculators;

import com.javamentor.calculators.exceptions.UnsupportedDigitException;

import java.util.HashMap;
import java.util.Map;

import static com.javamentor.Utils.arabCalculator;
import static com.javamentor.Utils.romanCalculator;
import static com.javamentor.calculators.DigitTypes.ARAB;
import static com.javamentor.calculators.DigitTypes.ROMAN;

public class Digits {
    public static class Value {
        DigitTypes type;
        int value;
        Calculator calculator;

        public Value(DigitTypes type, int value, Calculator calculator) {
            this.type = type;
            this.value = value;
            this.calculator = calculator;
        }

        public Calculator getCalculator() {
            return calculator;
        }
    }

    private static Map<String, Value> arabDigits = new HashMap<>();
    private static Map<String, Value> romanDigits = new HashMap<>();

    static {
        arabDigits.put("1", new Value(ARAB, 1, arabCalculator));
        arabDigits.put("2", new Value(ARAB, 2, arabCalculator));
        arabDigits.put("3", new Value(ARAB, 3, arabCalculator));
        arabDigits.put("4", new Value(ARAB, 4, arabCalculator));
        arabDigits.put("5", new Value(ARAB, 5, arabCalculator));
        arabDigits.put("6", new Value(ARAB, 6, arabCalculator));
        arabDigits.put("7", new Value(ARAB, 7, arabCalculator));
        arabDigits.put("8", new Value(ARAB, 8, arabCalculator));
        arabDigits.put("9", new Value(ARAB, 9, arabCalculator));
        arabDigits.put("10", new Value(ARAB, 10, arabCalculator));

        romanDigits.put("I", new Value(ROMAN, 1, romanCalculator));
        romanDigits.put("II", new Value(ROMAN, 2, romanCalculator));
        romanDigits.put("III", new Value(ROMAN, 3, romanCalculator));
        romanDigits.put("IV", new Value(ROMAN, 4, romanCalculator));
        romanDigits.put("V", new Value(ROMAN, 5, romanCalculator));
        romanDigits.put("VI", new Value(ROMAN, 6, romanCalculator));
        romanDigits.put("VII", new Value(ROMAN, 7, romanCalculator));
        romanDigits.put("VIII", new Value(ROMAN, 8, romanCalculator));
        romanDigits.put("IX", new Value(ROMAN, 9, romanCalculator));
        romanDigits.put("X", new Value(ROMAN, 10, romanCalculator));
    }

    public static Value checkValue(String origDigit) throws UnsupportedDigitException {
        String digit = origDigit.trim().toUpperCase();
        Value value = arabDigits.get(digit) != null ? arabDigits.get(digit) : romanDigits.get(digit);
        if (value == null) {
            throw new UnsupportedDigitException("Digit " + origDigit + " is not supported");
        }
        return value;
    }

    public static boolean isArab(String digit) {
        return arabDigits.containsKey(digit.trim().toUpperCase());
    }

    public static boolean isRoman(String digit) {
        return romanDigits.containsKey(digit.trim().toUpperCase());
    }
}
