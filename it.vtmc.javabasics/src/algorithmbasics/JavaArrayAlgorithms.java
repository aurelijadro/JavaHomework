package algorithmbasics;

import java.util.Arrays;
import java.util.Random;

// check out bubble-sort, quick-sort, 

public class JavaArrayAlgorithms {

	private static int[] numbers = new int[20];

	public static void main(String[] args) {
		// masyvas, u=pildyti skaiciais, metodas, skaiciuojantis laika

		// kai kuriais atvejais quick-sort'as nera efektyvus. bubble sort'as gali veikti
		// greiciau rusiuotose masyvuose
		// copy is array klases gali sukelti priblemu, kai actually nesukuriama nauja
		// kopija

		System.out.println(Arrays.toString(numbers));
		fillArrayWithNubers(numbers);
		//printArray(numbers);
		String operation = "prime"; // copyArray = copy, reverseArray=reverse, shufleArray = shuffle
		// getPrimeNumbersArray = prime,
		countTime(operation);

	}

	private static int[] fillArrayWithNubers(int[] numbers) {
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

	private static void countTime(String operation) {
		long start = System.currentTimeMillis();
		switch (operation) {
		case "copy":
			copyArray(numbers);
			break;
		case "reverse":
			reverseArray(numbers);
			break;	
		case "shuffle":
			shuffleArray(numbers);
			break;	
		case "prime":
			getPrimeNumbersArray(numbers);
			break;		
		default:
			System.out.println("...");
		}
		long stop = System.currentTimeMillis();
		System.out.println("Time for " + operation + " " + (stop - start) + " mS");

	}

	private static int[] copyArray(int[] numbers) {
		int[] copyNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			copyNumbers[i] = numbers[i];
		}

		return copyNumbers;

	}

	private static int[] reverseArray(int[] numbers) {
		int[] reverseArray = new int[numbers.length];
		int temp = 0;
		for (int i = (numbers.length - 1); i >= 0; i--) {
			reverseArray[temp]=numbers[i];
			temp++;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(reverseArray));
		return reverseArray;

	}
	
	private static int[] shuffleArray(int[] numbers) {
		//printArray(numbers);
		System.out.println();
		int tmp = 0;
		int randomIndex =0;
		int [] shuffledArray = new int [numbers.length];
			for(int i =0; i<numbers.length;i++) {
				randomIndex=(int)(Math.random() * numbers.length);
				if (i==randomIndex) continue;
				tmp =numbers [i];
				numbers[i]=numbers[randomIndex];
				numbers[randomIndex]=tmp;
			}	
			//printArray(numbers);
			return shuffledArray; 
	}
	
	private static int[] getPrimeNumbersArray(int[] numbers) { //optimize!
		int [] tempPrimeNumbers = new int [numbers.length];
		int counter = 0;
		for (int i =0; i<numbers.length; i++) {
			if (isPrime(numbers[i])) {
				tempPrimeNumbers[i]=numbers[i];
				counter++;
			} 
		} 
		
		int [] primeNumbers =new int [counter];
		counter =0;
		for (int i=0; i<tempPrimeNumbers.length; i++) {
			
			if (tempPrimeNumbers[i]>0) {
				primeNumbers[counter]=tempPrimeNumbers[i];
				counter++;
			}
		}
				
		printArray(primeNumbers);
		return primeNumbers;
		
	}
	
	private static boolean isPrime(int number) {
		if (number <2) {
			return false;
		}
		for (int i = 2; i<number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
//		int counter =0;
//		for (int number  : numbers) {
//			copyNumbers[counter] = number;
//			counter++;
//		}
//	 System.out.println(Arrays.equals(numbers, copyNumbers));
