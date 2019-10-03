package it.vtmc.javabasics;

import java.util.Scanner;

public class JavaSwitch {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSwitch();
		checkDifficultSwitch();
	}

	private static void checkSwitch() { // iki Java 7 switch'as dirbo tik su primityvais
		String color = "blue";
		switch(color) {
		case "red":
			System.out.println("Apples are red");
			break;
		case "blue":
			System.out.println("Sky is blue");
			break;
		case "green":
			System.out.println("Grass is greener on the other side");
			break;
			default:
				System.out.println("Rainbows and unicorns!!!");
		}
	}
	
	private static void checkDifficultSwitch() { //use case: menu, sub menu, sub sub menu...
		System.out.println("Input number");
		int number = input.nextInt();
		switch (number) {
		case 10:
			System.out.println("First level...");
			switch (number) {
			case 10:
				System.out.println("Next level...");
				break;
			}	
		break;
		}
		}
	}

