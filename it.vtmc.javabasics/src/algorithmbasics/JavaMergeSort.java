package algorithmbasics;

import java.util.Random;

public class JavaMergeSort {
	
	private static int[] nums = new int[10];

	public static void main(String[] args) {
		fillArrayWithNumbers(nums);
		printArray(nums);
		mergeSort(nums); //good for sorted and unsorted arrays
		//System.out.println();
		printArray(nums);
		
	}

	private static void mergeSort(int[] nums) {
		long start = System.currentTimeMillis();
		mergeSort(nums, new int[nums.length], 0, nums.length-1);
		long stop = System.currentTimeMillis();
		System.out.println((stop - start)+"ms");
	}
	
	

	private static void mergeSort(int[] nums, int[] temp, int leftStart, int rightEnd) {
		if (leftStart>=rightEnd){
			return;
		}
		int middle = (leftStart+rightEnd)/2;
		mergeSort(nums, temp, leftStart, middle);
		mergeSort(nums, temp, middle+1, rightEnd);
		mergeHalves(nums, temp, leftStart, rightEnd);
	}

	private static void mergeHalves(int[] nums, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart=leftEnd+1;
		int size = rightEnd-leftStart+1;
		
		int left= leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left<=leftEnd && right <=rightEnd) {
			if(nums[left]<=nums[right]) {
				temp[index]=nums[left];
				left++;
			} else {
				temp[index]=nums[right];
				right++;
			}
			index++;
		}
		System.arraycopy(nums, left, temp, index, leftEnd-left+1);
		System.arraycopy(nums, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, nums, leftStart, size);
		
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
