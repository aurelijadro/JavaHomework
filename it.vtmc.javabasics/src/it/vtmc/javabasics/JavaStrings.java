package it.vtmc.javabasics;

import java.util.Arrays;

public class JavaStrings {
	// immutable, char'u masyvas
	
	static String name = "Petras";

	public static void main(String[] args) {
		newName();
		name = "Tomas"; // negalima keisti nesukurus 
						//naujo objekto
		String surname = "Pavardukas";
		System.out.println(name +" " + surname); // sukuria nauja objekta
		// ("a" + "b") * 100 sukuria >300 objektu!
		String empty;
		newName();
		
		String test = "Labas"; //string pool
		String test2 = new String ("Labas");
		
		boolean resultString = test == test2; //reference check
		// boolean dirba tik su primityvais!
		System.out.println(resultString);
		
		System.out.println(test.equals(test2)); //Palyginti objektus
		
		System.out.println(test.toCharArray());
		
		stringBuilder();
		mathRunner();
		arrayRunner();
		
		
	}
	
	private static void newName() {
		System.out.println(name);
	}
	
	public static void stringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tomas ");
		builder.append("Tribusauskas");
		System.out.println(builder);
		builder.append(45);
		System.out.println(builder);
	}
	
	private static void mathRunner() {
		int num1 = 2;
		System.out.println(Math.cos(num1));
		System.out.println((int)(Math.random()*100));
	}
	
	private static void arrayRunner() {
		int [] intArray = new int [] {1, 2, 9, 7, 5, 6};
		int [] intArray2 = new int [10]; // desimties elemetu masymas
		intArray2[0] = 12;
		intArray2[5] = 45;
		System.out.println(intArray2); //atspausdina tik nuoroda
		System.out.println(Arrays.toString(intArray2));
		
		System.out.println(intArray2.length);
		System.out.println(intArray2.hashCode());//visu primityvu visumos suma
		
		// JAVA tik vienmaciai ir dvimaciai masyvai!!!
		
		int [][] intMatrix = new int [5] [];
		System.out.println(Arrays.deepToString(intMatrix));
		int [][] intMatrix2 = new int [5] [4];
		System.out.println(Arrays.deepToString(intMatrix2));
		int [][] intMatrix3 = new int [0] [2];
		System.out.println(Arrays.deepToString(intMatrix3));
		intMatrix2 [0][1] = 45;
		System.out.println(Arrays.deepToString(intMatrix2));
	}
}
