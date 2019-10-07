package it.vtmc.javabasics;

import java.util.Arrays;
import java.util.Random;

public class JavaQuickSort {
	
	// ar galima lyginti Strings?

	public static void main(String[] args) {
		String[] holidays = {"Christmas", "Easter", "Halloween", "Thanksgiving", "Valentines Day"};
		int [] nums = {14, 22, 17, 5, 27, 33, 0, 6, 15, 4, 2, 1, 55};
//		//Quick sort is recursive algorithm, which calls itself. Divide and conquer, 
//		//very efficient for large data sets
		quickSort(nums, 0, nums.length-1);
		System.out.println(Arrays.toString(nums));

	}

	private static void quickSort(int[] array, int start, int end) {
		if (start<end+1) {
			int pivotValue = partition(array, start, end);
			quickSort(array, start, pivotValue-1);
			quickSort(array, pivotValue+1, end);
		}
	}
	
	private static int partition(int[] array, int start, int end) {
		swap(array, start, getPivot(start, end));
		int border = start+1;
		for (int i=border; i<=end; i++) {
			if(array[i]<array[start]) {
				swap(array, i, border++);
			}
		}
		swap (array, start, border-1);
		return border-1;
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	
	private static int getPivot(int start, int end) {
		Random random = new Random();
		return random.nextInt((end-start+1))+start;
		
	}

}
