package it.vtmc.javabasics;

public class JavaSwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberChangerOne(10, 20);
		numberChangerTwo(5, 10);
		numberChangerThree(15, 8);
		numberChangerFour(4, 6);
	}

	private static void numberChangerFour(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		numberOne = numberOne ^ numberTwo; // 101 ^ 10 = 111
		numberTwo = numberOne ^ numberTwo; // 10 ^ 111 = 101
		numberOne = numberOne ^ numberTwo; // 111 ^ 101 = 10
		System.out.println(numberOne + ", " + numberTwo);
	}

	private static void numberChangerThree(int numberOne, int numberTwo) { // neveikia su 0
		System.out.println(numberOne + ", " + numberTwo);
		numberOne = numberOne * numberTwo;
		numberTwo = numberOne / numberTwo;
		numberOne = numberOne / numberTwo;
		System.out.println(numberOne + ", " + numberTwo);

	}

	private static void numberChangerTwo(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		numberOne = numberOne + numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne = numberOne - numberTwo;
		System.out.println(numberOne + ", " + numberTwo);

	}

	private static void numberChangerOne(int numberOne, int numberTwo) {
		System.out.println(numberOne + ", " + numberTwo);
		int tmp = numberOne;
		numberOne = numberTwo;
		numberTwo = numberOne;
		System.out.println(numberOne + ", " + numberTwo);

	}

}
