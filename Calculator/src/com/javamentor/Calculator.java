package com.javamentor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static void main(String[] args) throws NumberFormatException {
		// TODO (a + b, a - b, a * b, a / b

//		Input
		Scanner inputData = new Scanner(System.in);
		System.out.println("������� �������������� ���������: ");
		String mathExpression = inputData.nextLine();

//		RegEx
		Pattern mathExpressionPattern = Pattern.compile("^(1[0]|[1-9])(\\s[\\+|\\-|\\/|\\*]\\s)(1[0]|[1-9])");
		Matcher mathExpressionMatcher = mathExpressionPattern.matcher(mathExpression);

		if (mathExpressionMatcher.matches()) {
			System.out.println("������� ���������� ���������!");
		} else {
			System.out.println("�� ���������� ����. ");
		}

//		Split \s, String to int || char.
		String argExpression[] = mathExpression.split("\s");
		int firstNum = Integer.parseInt(argExpression[0]);
		int secondNum = Integer.parseInt(argExpression[2]);
		char binarySymbol = argExpression[1].charAt(0);
		
/*		Convert info
		int firstNumber = Integer.parseInt(firstArg);
		int secondNumber = Integer.parseInt(secondArg);
		String binaryArg = argExpression[1];
		char symbol[] = binaryArg.toCharArray();
		char binarySymbol = symbol[0];
*/
		
/*		First method
		if (firstNum <= 10 & firstNum > 0 & secondNum <= 10 & secondNum > 0) {
			if (binarySymbol == '+') {
				int result = firstNum + secondNum;
				System.out.println(result);
			} else if (binarySymbol == '-') {
				int result = firstNum - secondNum;
				System.out.println(result);
			} else if (binarySymbol == '*') {
				int result = firstNum * secondNum;
				System.out.println(result);
			} else if (binarySymbol == '/') {
				int result = firstNum / secondNum;
				System.out.println(result);
			}
		} else {
			System.out.println("������� �� ���������� �����.");
		}
*/
		
//		Second method
		switch (binarySymbol) {
		case '+':
			int result = firstNum + secondNum;
			System.out.println(result);
				break;
		case '-':
			result = firstNum - secondNum;
			System.out.println(result);
				break;
		case '*':
			result = firstNum * secondNum;
			System.out.println(result);
				break;
		case '/':
			result = firstNum / secondNum;
			System.out.println(result);
				break;
		}
		
		
		inputData.close(); // ���� ���������� ������������� ������, �� ���?

//		mathExpression = mathExpression.replaceAll("\\s","");   //���� ����� ������� �������
		
		
	}

}
