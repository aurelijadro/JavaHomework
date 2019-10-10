package algorithmbasics;

import java.util.Random;

public class JavaInsertionSort {

	private static int[] nums = new int[100000];

	public static void main(String[] args) {
		fillArrayWithNumbers(nums);
		//printArray(nums);
		insertionSort(nums);
		//System.out.println();
		//printArray(nums);

	}

	private static void insertionSort(int[] nums) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < nums.length; i++) {
			for (int z = i; z > 0; z--) {
				if (nums[z] < nums[z - 1]) {
					nums[z] = nums[z] ^ nums[z - 1];
					nums[z - 1] = nums[z] ^ nums[z - 1];
					nums[z] = nums[z] ^ nums[z - 1];
				}
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println((stop - start)+"ms");
	}

	private static int[] fillArrayWithNumbers(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}