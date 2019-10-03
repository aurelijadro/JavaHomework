package it.vtmc.javabasics;

public class JavaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkWhile();
	}
	
	private static void checkWhile() {
		//Infinite loop!
//		while(true) {
//			
//		}
		
		int number = 0;
		while (number != 10) {
			System.out.println("Hello");
			number++;
		}
		int number2 =0; 
		do {
			System.out.println("Hello Again!");
			number2++;
		} while (number2 != 10);
		
	}
}
