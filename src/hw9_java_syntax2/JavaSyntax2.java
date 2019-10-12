package hw9_java_syntax2;

import java.util.Scanner; // Import the scanner class

public class JavaSyntax2 {
	private static Scanner myObj = new Scanner(System.in); // Create a scanner object

	public static void main(String[] args) {
		// 9.1 check if triangle is rectangled
		isRectangled();
		// 9.2 find discriminant for quadratic equation
		findDiscriminant();
		// 9.3 guess random num from 0 to 100
		guessTheNumber();
		// 9.4 y=3x, x = (0 --> 10) use if
		solveEquation();
		// 9.5 y=3x, x = (0 --> 10) use while
		solveEquation2();
		// 9.6 sum numbers from 1 to 100, use for
		sumNumbers(1, 100);
		// 9.7 sum numbers from 1 to 100, use while
		sumNumbers2(1, 100);
		// 9.8 sum numbers from 1 to 100, use do while
		sumNumbers3(1, 100);
		// 9.9 prints capital letters from A to Z use for
		printCapitalLetters();
		// 9.10 print multiplication table for numbers from 1 to 100
		printMultiplicationTable();
	}

	private static void isRectangled() {
		boolean isRectangled = false;
		System.out.println("Please input lenght of the first side of the triangle");
		float firstSide = myObj.nextFloat();
		if (firstSide <= 0) {
			System.out.println("Your input is invalid");
			isRectangled();
		}

		System.out.println("Please input lenght of the second side of the triangle");
		float secondSide = myObj.nextFloat();
		if (secondSide <= 0) {
			System.out.println("Your input is invalid");
			isRectangled();
		}

		System.out.println("Please input lenght of the third side of the triangle");
		float thirdSide = myObj.nextFloat();
		if (thirdSide <= 0) {
			System.out.println("Your input is invalid");
			isRectangled();
		}

		if ((firstSide > secondSide) && (firstSide > thirdSide)) {
			if (Math.pow(firstSide, 2) == (Math.pow(secondSide, 2) + Math.pow(thirdSide, 2))) {
				isRectangled = true;
			}
		}
		if ((secondSide > firstSide) && (secondSide > thirdSide)) {
			if (Math.pow(secondSide, 2) == (Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))) {
				isRectangled = true;
			}
		}

		if ((thirdSide > firstSide) && (thirdSide > secondSide)) {
			if (Math.pow(thirdSide, 2) == (Math.pow(firstSide, 2) + Math.pow(secondSide, 2))) {
				isRectangled = true;
			}
		}

		if (isRectangled) {
			System.out.println("Your triangle is rectangled!");
		} else {
			System.out.println("Your triangle is not rectangled!");
		}
	}

	private static void findDiscriminant() {
		System.out.println("Quadratic quation = ax^2+bx+c. Please provide argument \"a\":");
		double a = myObj.nextDouble();
		System.out.println("Quadratic quation = ax^2+bx+c. Please provide argument \"b\":");
		double b = myObj.nextDouble();
		System.out.println("Quadratic quation = ax^2+bx+c. Please provide argument \"c\":");
		double c = myObj.nextDouble();
		double discriminant = roundNumber(Math.pow(b, 2) - 4 * a * c);
		if (discriminant == 0) {
			System.out.println("Discriminant for equation " + a + "x^2+" + b + "x+" + c + "=0 is: " + discriminant
					+ ". Equation has one solution.");
		} else if (discriminant > 0) {
			System.out.println("Discriminant for equation " + a + "x^2+" + b + "x+" + c + "=0 is: " + discriminant
					+ ". Equation has two solutions.");
		} else {
			System.out.println("Discriminant for equation " + a + "x^2+" + b + "x+" + c + "=0 is: " + discriminant
					+ ". Solutions for this equation are not real numbers.");
		}

	}

	private static double roundNumber(double num) {
		double roundedNum = num * 100;
		roundedNum = Math.round(roundedNum);
		roundedNum = roundedNum / 100;
		return roundedNum;
	}

	private static void guessTheNumber() {
		System.out.println("Guess integer from 0 to 100");
		int userGuess = myObj.nextInt();
		int correctNumber = randomNumberGenerator();
		if (userGuess == correctNumber) {
			System.out.println("You are correct! The winning number is " + userGuess);
		} else {
			System.out.println("Better luck next time. Correct answer was " + correctNumber);
		}
	}

	private static int randomNumberGenerator() {
		int randomNumber = (int) (Math.random() * 100 + 1);
		return randomNumber;
	}

	private static void solveEquation() {
		int y = 0;
		for (int x = 0; x <= 10; x++) {
			y = 3 * x;
			System.out.println("When x=" + x + " y=" + y);
		}
	}

	private static void solveEquation2() {
		int n = 0;
		int z = 0;
		while (n <= 10) {
			z = 3 * n;
			System.out.println("When x=" + n + " y=" + z);
			n++;
		}

	}

	private static void sumNumbers(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("Sum of all integer numbers from " + start + " to " + end + " is: " + sum);
	}

	private static void sumNumbers2(int start, int end) {
		int sum = 0;
		int i = start;
		while (i <= end) {
			sum += i;
			i++;
		}
		System.out.println("Sum of all integer numbers from " + start + " to " + end + " is: " + sum);
	}

	private static void sumNumbers3(int start, int end) {
		int sum = 0;
		int i = start;
		do {
			sum += i;
			i++;
		} while (i <= (end));
		System.out.println("Sum of all integer numbers from " + start + " to " + end + " is: " + sum);
	}

	private static void printCapitalLetters() {
		for (int charVal = 65; charVal <= 90; charVal++) {
			System.out.print((char) (charVal) + " ");
		}
	}

	private static void printMultiplicationTable() {
		for (int firstArg = 1; firstArg <= 100; firstArg++) {
			for (int secondArg = 1; secondArg <= 100; secondArg++) {
				System.out.print(firstArg + "*" + secondArg + "=" + (firstArg * secondArg) + " | ");
			}
			System.out.println();
		}
	}

}
