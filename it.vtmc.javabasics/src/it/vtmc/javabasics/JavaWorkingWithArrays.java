package it.vtmc.javabasics;

import java.util.Random;

public class JavaWorkingWithArrays {

	public static void main(String[] args) {
		int[] numbers = new int[5]; // destination
		int[] otherNumbers = new int[2]; // source
		// printArray(numbers);
		fillArray(numbers);
		fillArray(otherNumbers);
		int index = 2500;
		int value = 45;
		// insertElementByIndex(numbers, index, value);
		insertElementsByIndexRandom(numbers, otherNumbers);
		// printArray(numbers);

	}

	private static void insertElementsByIndexRandom(int[] numbers, int[] otherNumbers) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 0; i < otherNumbers.length; i++) {
			int randomIndex = random.nextInt(numbers.length - 1);
			numbers = insertElementByIndex(numbers, randomIndex, otherNumbers[i]);

		}
		printArray(numbers);
		System.out.println();
	}

	private static int[] fillArray(int[] numbers) {
		long start = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}
		long end = System.currentTimeMillis();
		// System.out.println(end - start / 1000);
		return numbers;
	}

	private static int[] insertElementByIndex(int[] numbers, int index, int value) {
		long start = System.currentTimeMillis();
		int[] newNumbers = new int[numbers.length + 1];
		if (index < numbers.length) {
			for (int i = 0; i < index; i++) {
				newNumbers[i] = numbers[i];
			}
			newNumbers[index] = value;
			for (int i = index + 1; i < newNumbers.length; i++) {
				newNumbers[i] = numbers[i - 1];
			}

		}
		long end = System.currentTimeMillis();
		// System.out.println("Trukme" + (end - start / 1000));
		printArray(newNumbers);
		return newNumbers;
	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}

}
