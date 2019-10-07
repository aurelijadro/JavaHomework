package algorithmbasics;

import java.util.Random;

public class JavaSelectionSort {
	
	private static int[] nums = new int[100000];

	public static void main(String[] args) {
		fillArrayWithNumbers(nums);
		//printArray(nums);
		selectionSort(nums); //good for sorted and unsorted arrays
		//System.out.println();
		//printArray(nums);
		
	}

	private static void selectionSort(int[] nums) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < nums.length; i++) {
			int minElementIndex =i;
			for (int z = i+1; z< nums.length; z++) {
				
				if (nums[minElementIndex]>nums[z]) {
					minElementIndex=z;
				}
			}
			if (minElementIndex != i) {
				int tmp = nums [i];
				nums[i] = nums[minElementIndex];
				nums [minElementIndex] = tmp;
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
