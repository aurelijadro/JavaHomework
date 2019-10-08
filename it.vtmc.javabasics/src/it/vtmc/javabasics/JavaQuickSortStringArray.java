package it.vtmc.javabasics;

import java.util.Arrays;
import java.util.Random;

public class JavaQuickSortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "Harry", "Hermione", "Ron", "Luna", "Sirius", "Belatrix", "Lily", "Nevile", "Minerva",
		"Ginny" };
		quickSort(words, 0, words.length-1);
		System.out.println(Arrays.toString(words));
		//System.out.println(compareStrings("Ron", "Serius"));
	}
	
	private static void quickSort(String[] array, int start, int end) {
		if (start<end+1) {
			int pivotValue = partition(array, start, end);
			quickSort(array, start, pivotValue-1);
			quickSort(array, pivotValue+1, end);
		}
	}
	
	private static int partition(String[] array, int start, int end) {
		swap(array, start, getPivot(start, end));
		System.out.println("set pivot swap!");
		int border = start+1;
		for (int i=border; i<=end; i++) {
			boolean goesBeforePivot = compareStrings(array[i],array[start]);
			if(goesBeforePivot) {
				swap(array, i, border++);
				System.out.println("goes before pivot SWAP!");
			}
		}
		swap (array, start, border-1);
		System.out.println("reset pivot swap");
		return border-1;
	}

	private static void swap(String[] array, int index1, int index2) {
		String temp = array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	
	private static int getPivot(int start, int end) {
		Random random = new Random();
		return random.nextInt((end-start+1))+start;
		
	}
	
	private static boolean compareStrings(String wordI, String wordStart) {
		int wordLength1 = wordI.length();
		int wordLength2 = wordStart.length();
		int maxIndex = (wordLength1 < wordLength2) ? wordLength1 : wordLength2;
		for (int z = 0; z < maxIndex; z++) {
			int wordIChar = wordI.toLowerCase().charAt(z);
			int wordStartChar = wordStart.toLowerCase().charAt(z);
			System.out.println((char)(wordIChar) +"+"+(char)(wordStartChar));
			if (wordIChar < wordStartChar) {
				System.out.println(wordI+" "+wordStart);
				return true;
			}
			if (wordIChar > wordStartChar) {
				return false;
			}
		}
		
		return false;
			
	}


}
