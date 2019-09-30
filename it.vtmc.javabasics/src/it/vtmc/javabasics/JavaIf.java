package it.vtmc.javabasics;

import java.util.Scanner;

public class JavaIf {
	
	private static Scanner input = new Scanner(System.in);

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		//checkIf();
		//checkIfElse(); //how to find Enter in a user input?
		//checkIfElseIf();
		ternaryIf();
	}
	
	private static void checkIf() {
		System.out.println("Input name");
		String name = input.next();
		if (name.equals("Tomas")) {
			System.out.println("OK");
		} 
	}
	

	private static void checkIfElse() {
		System.out.println("Input name");
		String name = input.next();
		if (name != null) {
			System.out.println(name);
		} else {
		System.out.println("Name Unknown");
		}
	}
	
	private static void checkIfElseIf() {
		System.out.println("Input name");
		String name = input.next();
		if (name.equals("Tomas")) {
			System.out.println("Name is Tomas");
		} else if (name.equals("Petras")) {
		System.out.println("Hello, Petras");
		} else {
			System.out.println("Name Unknown");
		}
	}
	
	private static void ternaryIf() {
		int num = 100;
		Boolean result = (num == 100) ? true : false;
		String result1 = (num == 100) ? "Hundred" : "Not hundred";
		Boolean result2 = (num == 100) ? true : (num == 90) ? true : false;
		System.out.println(result + " "+ result1 +" "+ result2);
		
		
	}
}
