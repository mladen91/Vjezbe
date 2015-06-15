package Predavanja;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert your operation: ");
		String equation = in.nextLine();
		String operator = equation;
		operator = equation.replaceAll("\\s", "");

		int length = operator.length();
		int counter = 0;

		String num1 = "";
		String num2 = "";

		System.out.println(operator);
		for (int i = 0; i < length; i++) {
			if (operator.charAt(i) == '+' || operator.charAt(i) == '-') {
				counter = operator.indexOf(operator.charAt(i));

			}

		}

		num1 = operator.substring(0, counter);
		num2 = operator.substring(counter + 1, length);

		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);

		switch (operator.charAt(counter)) {

		case '+':
			System.out.println(number1 + number2);
			break;
		case '-':
			System.out.println(number1 - number2);
			break;

		}

	}

}
