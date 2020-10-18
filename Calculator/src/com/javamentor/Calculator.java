package com.javamentor;

import com.javamentor.calculators.Digits;
import com.javamentor.calculators.exceptions.DifferentDigitsException;
import com.javamentor.calculators.exceptions.UnsupportedDigitException;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws NumberFormatException {
        // TODO (a + b, a - b, a * b, a / b)

        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter the expression to eveluate: ");

        while (inputData.hasNext()) {
            String mathExpression = inputData.nextLine();


            String[] s = mathExpression.split(" ");

            if (s.length != 3) {
                System.err.println("Incorrect expression");
                continue;
            }

            try {
                System.out.println("Result = " + Digits.checkValue(s[0]).getCalculator().calculate(s[0], s[2], s[1]));
            } catch (UnsupportedDigitException | DifferentDigitsException | UnsupportedOperationException e) {
                System.err.println(e.getMessage());
            } catch (RuntimeException re) {
                re.printStackTrace();
            }

        }

        inputData.close();
    }

}
