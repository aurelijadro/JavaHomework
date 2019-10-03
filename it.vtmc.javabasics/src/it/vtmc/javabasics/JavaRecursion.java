package it.vtmc.javabasics;

public class JavaRecursion {

	public static void main(String[] args) {
		makeSimpleRecursion(5);
		makeDifficultRecursion(5);

	}

	private static void makeDifficultRecursion(int number) {
		number--;
		System.out.println("First method start section " + number);
		makeSimpleRecursion(number);
		System.out.println("First method end section " + number);

	}

	private static void makeSimpleRecursion(int number) {
		number--;
		System.out.println("Second method start section " + number);
		if (number != 0) {
			makeSimpleRecursion(number);
		}
		System.out.println("Second method end section " + number);

	}

}
