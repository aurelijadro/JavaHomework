package hw11_java_algorithm_basics3;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * @author aurelija Java Homework
 */

public class AlgorithmBasics3 {
	public static void main(String[] args) {
		// 11.1 find greatest common divisor
		int num1 = 6;
		int num2 = 14;
		findGreatestCommonDivisor(num1, num2);
		// 11.2 calculate smallest common multiple
		calculateSmallestCommonMultiple(num1, num2);
		// 11.3 create int [10] and write a program witch creates a largest possible
		// number
		// example: [2,45,6] -> 6452
		int[] nums = new int[10];
		int[] nums2 = { 17, 71, 2, 7, 8, 0, 20, 93, 26, 99 };
		fillArray(nums);
		System.out.println(Arrays.toString(nums));
		generateLargestNumFromArrayItems(nums);
		System.out.println(Arrays.toString(nums));
		// 11.4 create an array with sums of other two arrays elements
		int[] firstIntArray = new int[5];
		int[] secondIntArray = new int[9];
		fillArray(firstIntArray);
		fillArray(secondIntArray);
		System.out.println(Arrays.toString(firstIntArray));
		System.out.println(Arrays.toString(secondIntArray));
		System.out.println(Arrays.toString(sumArrays(firstIntArray, secondIntArray)));
		// 11.5 count how many times a word repeats in a text
		String text = "If two witches would watch two watches, which witch would watch which watch?";
		String word = "watch";
		countWordRepeats(text, word);
	}

	private static void findGreatestCommonDivisor(int num1, int num2) {
		// find smaller number:
		int smallerNum = (num1 < num2) ? num1 : num2;
		// find common divisor:
		for (int i = smallerNum; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("Greatest common divisor is: " + i);
				break;
			}
		}
	}

	private static void calculateSmallestCommonMultiple(int num1, int num2) {
		int smallestCommonMultiple = 0;
		for (int i = 1;; i++) {
			for (int z = 1; z < 100; z++) {
				if (num1 * i == num2 * z) {
					smallestCommonMultiple = num1 * i;
					System.out.println("Smallest Common Multiple is: " + smallestCommonMultiple);
					break;
				}

			}
			if (smallestCommonMultiple != 0) {
				break;
			}

		}
	}

	private static void fillArray(int[] nums) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100);
		}
	}

	private static void generateLargestNumFromArrayItems(int[] nums) {

		// String[] strings = new String [nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int z = 0; z < nums.length - 1; z++) {
				String first = Integer.toString(nums[z]);
				String second = Integer.toString(nums[z + 1]);

				if (Integer.parseInt(first + second) < Integer.parseInt(second + first)) {
					swap(nums, z, z + 1);
				}

			}

		}
		System.out.println(arrayIntsToNumber(nums));

	}

	private static void swap(int[] nums, int first, int second) {
		int tmp = nums[first];
		nums[first] = nums[second];
		nums[second] = tmp;

	}

	private static BigInteger arrayIntsToNumber(int[] nums) {

		String numberString = "";
		for (int i = 0; i < nums.length; i++) {
			numberString = numberString + Integer.toString(nums[i]);
		}
		BigInteger number = new BigInteger(numberString);
		return number;

	}

	private static int[] sumArrays(int[] firstIntArray, int[] secondIntArray) {
		int[] shorter, longer;
		if (firstIntArray.length < secondIntArray.length) {
			shorter = firstIntArray;
			longer = secondIntArray;
		} else {
			shorter = secondIntArray;
			longer = firstIntArray;
		}
		int[] summed = new int[longer.length];
		for (int i = 0; i < shorter.length; i++) {
			summed[i] = shorter[i] + longer[i];
		}
		for (int i = shorter.length; i < longer.length; i++) {
			summed[i] = longer[i];
		}
		return summed;

	}

	private static void countWordRepeats(String text, String word) {
		String[] words = text.split(" ");
		int wordCount = 0;
		for (int i = 0; i < words.length; i++) {
			if (word.toLowerCase().equals(words[i].toLowerCase())) {
				wordCount++;
			}
		}
		System.out.println("Word \"" + word + "\" repeats " + wordCount + " times in the text");
	}
}
