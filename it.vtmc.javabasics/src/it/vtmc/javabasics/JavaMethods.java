package it.vtmc.javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSome();
		int number = 10;
		printSome(number);
		double doubleNumber = 123456.75421212;
		printSome(doubleNumber);
		String[] names = { "Kate", "Tom", "Peter", "Anna" };
		printSome(names);
		String[] trees = new String[3]; // Empty array with 3 elements
		printSome(makeTreesArray(trees));
		int[] treeHeigth = new int[trees.length];
		printSome(makeTreesArray(trees, treeHeigth));
	}

	private static String[] makeTreesArray(String[] trees, int[] treeHeigth) {
		// TODO Auto-generated method stub
		String[] treesInfo = new String[trees.length];
		for (int i = 0; i < trees.length; i++) {
			System.out.println("Input " + trees[i] + " heigth");
			treesInfo[i] = trees[i] + " " + input.nextInt();
		}
		return treesInfo;
	}

	private static String[] makeTreesArray(String[] trees) {
		// TODO Auto-generated method stub
		for (int i = 0; i < trees.length; i++) {
			System.out.println("Input tree name");
			trees[i] = input.nextLine();
		}
		return trees;
	}

	private static void printSome() {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
	}

	private static void printSome(int number) {
		// TODO Auto-generated method stub
		System.out.println(number);
	}

	private static void printSome(double doubleNumber) {
		// TODO Auto-generated method stub
		System.out.println(doubleNumber);
	}

	private static void printSome(String[] names) {
		// first method to print array:
		System.out.println(Arrays.toString(names));

		// second method to print array:
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		// third method to print array:
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

	}
}
