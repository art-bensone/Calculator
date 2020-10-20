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
        romanDigits.put(22, "XXII");
        romanDigits.put(23, "XXIII");
        romanDigits.put(24, "XXIV");
        romanDigits.put(25, "XXV");
        romanDigits.put(26, "XXVI");
        romanDigits.put(27, "XXVII");
        romanDigits.put(28, "XXVIII");
        romanDigits.put(29, "XXIX");
        romanDigits.put(30, "XXX");
        romanDigits.put(31, "XXXI");
        romanDigits.put(32, "XXXII");
        romanDigits.put(33, "XXXIII");
        romanDigits.put(34, "XXXIV");
        romanDigits.put(35, "XXXV");
        romanDigits.put(36, "XXXVI");
        romanDigits.put(37, "XXXVII");
        romanDigits.put(38, "XXXVIII");
        romanDigits.put(39, "XXXIX");
        romanDigits.put(40, "XL");
        romanDigits.put(41, "XLI");
        romanDigits.put(42, "XLII");
        romanDigits.put(43, "XLIII");
        romanDigits.put(44, "XLIV");
        romanDigits.put(45, "XLV");
        romanDigits.put(46, "XLVI");
        romanDigits.put(47, "XLVII");
        romanDigits.put(48, "XLVIII");
        romanDigits.put(49, "XLIX");
        romanDigits.put(50, "L");
        romanDigits.put(51, "LI");
        romanDigits.put(54, "LIV");
        romanDigits.put(52, "LII");
        romanDigits.put(53, "LIII");
        romanDigits.put(54, "LIV");
        romanDigits.put(55, "LV");
        romanDigits.put(56, "LVI");
        romanDigits.put(57, "LVII");
        romanDigits.put(58, "LVIII");
        romanDigits.put(59, "LIX");
        romanDigits.put(60, "LX");
        romanDigits.put(61, "LXI");
        romanDigits.put(62, "LXII");
        romanDigits.put(63, "LXIII");
        romanDigits.put(64, "LXIV");
        romanDigits.put(65, "LXV");
        romanDigits.put(66, "LXVI");
        romanDigits.put(67, "LXVII");
        romanDigits.put(68, "LXVIII");
        romanDigits.put(69, "LXIX");
        romanDigits.put(70, "LXX");
        romanDigits.put(71, "LXXI");
        romanDigits.put(72, "LXXII");
        romanDigits.put(73, "LXXIII");
        romanDigits.put(74, "LXXIV");
        romanDigits.put(75, "LXXV");
        romanDigits.put(76, "LXXVI");
        romanDigits.put(77, "LXXVII");
        romanDigits.put(78, "LXVIII");
        romanDigits.put(79, "LXXIX");
        romanDigits.put(80, "LXXX");
        romanDigits.put(81, "LXXXI");
        romanDigits.put(82, "LXXXII");
        romanDigits.put(83, "LXXXIII");
        romanDigits.put(84, "LXXXIV");
        romanDigits.put(85, "LXXXV");
        romanDigits.put(86, "LXXXVI");
        romanDigits.put(87, "LXXXVII");
        romanDigits.put(88, "LXXXVIII");
        romanDigits.put(89, "LXXXIX");
        romanDigits.put(90, "XC");
        romanDigits.put(91, "XCI");
        romanDigits.put(92, "XCII");
        romanDigits.put(93, "XCIII");
        romanDigits.put(94, "XCIV");
        romanDigits.put(95, "XCV");
        romanDigits.put(96, "XCVI");
        romanDigits.put(97, "XCVII");
        romanDigits.put(98, "XCVIII");
        romanDigits.put(99, "XCIX");
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
