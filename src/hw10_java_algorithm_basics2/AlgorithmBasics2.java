package hw10_java_algorithm_basics2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * @author aurelija practice work no-10 @ Akademija.IT
 */
public class AlgorithmBasics2 {
	public static void main(String[] args) {
		// 10.1 create a sorted int array of 100 elements
		printArray(getRandomIncreasingNumbers(100));
		// 10.2 120th number of Fibonacci sequence - find it faster than 5 seconds
		getNthFibonacciNumber(120);
		// 10.3 generate two random int arrays of >=20 elements,
		// find largest element in each array and calculate their arithmetic mean
		calculateArithmeticMeanOfMaxValuesOfTwoArrays();
		// 10.4 print sorter string array
		String[] words = { "Harry", "Hermione", "Ron", "Luna", "Sirius", "Belatrix", "Lily", "Nevile", "Minerva",
				"Ginny" };
		sortAndPrintStringArray(words);
		// 10.5 Quick sort for long type array of 50000 elements
		Long[] longNumbers = new Long[50000];
		fillWithLongNumbers(longNumbers);
		quickSort(longNumbers, 0, longNumbers.length - 1);

	}

	private static void calculateArithmeticMeanOfMaxValuesOfTwoArrays() {
		// Generate arrays:
		Random random = new Random();
		int[] nums1 = new int[(random.nextInt(81) + 20)];
		int[] nums2 = new int[(random.nextInt(81) + 20)];
		// Fill Arrays with numbers:
		fillArrayWithNumbers(nums1);
		fillArrayWithNumbers(nums2);
		// Calculate arithmetic mean of max numbers:

		float arithmeticMean = ((float) findLargestNumInArray(nums1) + (float) findLargestNumInArray(nums2)) / 2;
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		System.out.println("Arithmetic mean is:" + arithmeticMean);

	}

	private static int[] fillArrayWithNumbers(int[] nums) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100);
		}
		return nums;
	}

	private static int findLargestNumInArray(int[] nums) {
		int maxVal = 0;
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > maxVal) {
					maxVal = nums[i];
				}
			}
		}
		return maxVal;
	}

	private static void getNthFibonacciNumber(int nth) {

		long start = System.currentTimeMillis();
		BigInteger fibonacciNumber = new BigInteger("0");
		BigInteger prev = new BigInteger("0");
		BigInteger next = new BigInteger("1");
		if (nth == 0) {
			fibonacciNumber = BigInteger.valueOf(0);
		} else if (nth == 1) {
			fibonacciNumber = BigInteger.valueOf(1);
		} else {
			for (int i = 2; i < nth; i++) {
				fibonacciNumber = prev.add(next);
				prev = next;
				next = fibonacciNumber;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println(nth + " Fibonacci number is: " + fibonacciNumber);
		System.out.println("It took " + (end - start) + "ms to calculate.");
	}

	private static int[] getRandomIncreasingNumbers(int ammount) {
		int[] hundredNums = new int[ammount];
		Random random = new Random();
		for (int i = 0; i < ammount; i++) {
			hundredNums[i] = random.nextInt();
		}
		Arrays.sort(hundredNums);
		return hundredNums;
	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

	private static void sortAndPrintStringArray(String[] words) {
		quickSortArray(words, 0, words.length - 1);
		System.out.println(Arrays.toString(words));
	}

	private static void quickSortArray(String[] words, int start, int end) {
		if (start < end + 1) {
			int pivotValue = partition(words, start, end);
			quickSortArray(words, start, pivotValue - 1);
			quickSortArray(words, pivotValue + 1, end);
		}
	}

	private static int partition(String[] words, int start, int end) {
		swap(words, start, getPivot(start, end));
		int border = start + 1;
		for (int i = border; i <= end; i++) {
			if (compareStrings(words[i], words[start])) {
				swap(words, i, border++);
			}
		}
		swap(words, start, border - 1);
		return border - 1;
	}

	private static int getPivot(int start, int end) {
		Random random = new Random();
		return random.nextInt((end - start + 1)) + start;

	}

	private static boolean compareStrings(String word1, String word2) {
		int wordLength1 = word1.length();
		int wordLength2 = word2.length();
		int maxIndex = (wordLength1 < wordLength2) ? wordLength1 : wordLength2;
		for (int z = 0; z < maxIndex; z++) {
			int word1Char = word1.toLowerCase().charAt(z);
			int word2Char = word2.toLowerCase().charAt(z);
			if (word2Char > word1Char) {
				return true;
			}
			if (word2Char < word1Char) {
				return false;
			}
		}
		return false;
	}

	private static void swap(String[] words, int index1, int index2) {
		String temp = words[index1];
		words[index1] = words[index2];
		words[index2] = temp;
	}

	private static void quickSort(Long[] longNumbers, int start, int end) {
		if (start < end + 1) {
			int pivotValue = partitionLong(longNumbers, start, end);
			quickSort(longNumbers, start, pivotValue - 1);
			quickSort(longNumbers, pivotValue + 1, end);
		}
	}

	private static int partitionLong(Long[] longNumbers, int start, int end) {
		swap(longNumbers, start, getPivot(start, end));
		int border = start + 1;
		for (int i = border; i <= end; i++) {
			if (longNumbers[i] < longNumbers[start]) {
				swap(longNumbers, i, border++);
			}
		}
		swap(longNumbers, start, border - 1);
		return border - 1;
	}

	private static void swap(Long[] longNumbers, int index1, int index2) {
		long temp = longNumbers[index1];
		longNumbers[index1] = longNumbers[index2];
		longNumbers[index2] = temp;
	}

	private static void fillWithLongNumbers(Long[] longNumbers) {
		Random random = new Random();
		for (int i = 0; i < longNumbers.length; i++) {
			longNumbers[i] = random.nextLong();
		}
	}
}
