package algorithmbasics;

import java.util.Random;

public class JavaRemoveElement {

	public static void main(String[] args) {
		int[] nums = new int[10000000]; // 400000000B / 1000000 
		int[] nums2= {5, 10, 12, 14, 13, 2};
		fillArrayWithNumbers(nums);
		int value = 10;
//		printArray(nums);
//		System.out.println();
//		printArray(removeElementsByValue(nums, value));
		removeElementsByValue(nums, value);
	}

	private static int[] removeElementsByValue(int[] nums, int value) {
		long start = System.currentTimeMillis();
		int count = 0;

		for (int number : nums) {
			if (number != value) {
				count++;
			}
		}
		int[] newNums = new int[count];
		count =0;
		for (int i =0; i<nums.length; i++) {
			if (nums[i] != value){
				newNums[count]=nums[i];
				count++;
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop-start + "ms");
		return newNums;
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
