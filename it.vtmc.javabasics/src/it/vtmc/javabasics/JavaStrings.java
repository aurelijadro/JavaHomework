package it.vtmc.javabasics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class JavaStrings {
	// immutable, char'u masyvas
	private static Scanner input = new Scanner(System.in);
	static String name = "Petras";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//stringBuilder();
		//mathRunner();
		//arrayRunner();
		//nauji:
		//compareStrings();
		//trimStrings();
		//splitStrings();
		//indexString();
		//subString();
		//containsString(); //read about contains - wild cards!
		//concatenateString();
		//joinString();
		//valueOfString();
		stringTokenizer();
		
		
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
	
		private static void compareStrings() {
			System.out.println("Input name");
			String result = input.next().toLowerCase();
			System.out.println(result.equals("Tomas".toLowerCase()));
			String name = null;
			System.out.println(result.contentEquals(name));// false
			String str1 ="Taki";
			String str2 ="TAKI";
			System.out.println(str1.toLowerCase().contentEquals(str2.toLowerCase()));
			Locale locale = Locale.forLanguageTag("tr-TR");
			System.out.println(str1.toLowerCase(locale).equals(str2.toLowerCase(locale)));
		}
		
		private static void trimStrings() {
			String text = "      This is a long string ...       ";
			System.out.println(text.trim());
		}		
		private static void splitStrings() {
			String text = "      This is a long string ...       ";
			String [] words = text.split(" "); //grazina masyva
			System.out.println(Arrays.toString(words)); 
		}
		
		private static void indexString() {
			String text = "      This is a long string ...       ";
			System.out.println(text.charAt(9));
			System.out.println(text.replace('i', 'o'));
		}
		
		private static void subString() {
			String text = "      This is a long string ...       ";
			System.out.println(text.substring(9));
			System.out.println(text.substring(9, 15));
		}
		
		private static void containsString() {
			String text = "      This is a long string ...       ";
			System.out.println(text.contains("long"));
			//System.out.println(text.matches("??is"));
		}
		
		private static void concatenateString() {
			String text = "      This is a long string ...       ";
			System.out.println(text.concat("lalalalalala"));
		}
		
		private static void joinString() {
			String [] names = {"Tadas", "Tomas", "Petras"};
			String singleString = String.join(", ", names);
			System.out.println(singleString);
			
			StringJoiner joiner = new StringJoiner(", "); //better!
			joiner.add(names[0]);
			joiner.add(names[1]);
			joiner.add(names[2]);
			System.out.println(joiner);
		}
		
		private static void valueOfString() { // bet ka keicia i STRING
			String text = String.valueOf(input.next());
			int num = 12;
			String text2 = String.valueOf(num);
			System.out.println(text2 instanceof String);
			
		}
		
		private static void stringTokenizer() {
			String text = "Little text for string tokenizer";
			StringTokenizer tokens = new StringTokenizer(text);
			while(tokens.hasMoreTokens()) {
				System.out.println(tokens.nextToken());
			}
			
			
		}
}
