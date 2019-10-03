package it.vtmc.javabasics;

import java.util.Arrays;
import java.util.Random;

public class JavaPasswordsGenerator {

	public static void main(String[] args) {
		// generatePassword(8);
		// printString(generatePassword(8));
		String[] passwordsArray = new String[3000000]; // 3000000milijonai slaptazodziu turi buti unikalus
		// surusiuoti masyva?
		String[] passwordsForLT = createManyPasswords(passwordsArray, 8);
		//printArray(passwordsForLT);
		checkForSameData(passwordsForLT);
	}

	private static void checkForSameData(String[] passwordsForLT) {
		boolean passwordsRepeat = false;
		Arrays.sort(passwordsForLT);
		for (int i = 0; i < passwordsForLT.length-1; i++) {
			if (passwordsForLT[i] == passwordsForLT[i + 1]) {
				passwordsRepeat = true;
				//break;
			}
		}
		System.out.println(passwordsRepeat);
	}


	private static String generatePassword(int passwordLength) {
		if (passwordLength < 1) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		char[] charArrayForPassword = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
				'6', '7', '8', '9', '*', '#', '@', '%', '<', '>', '/', '\\', '&' };
		for (int i = 0; i < passwordLength; i++) {
			builder.append(charArrayForPassword[random.nextInt(charArrayForPassword.length)]);
		}

		return builder.toString();
	}

	private static String[] createManyPasswords(String[] passwords, int length) {
		// long start = System.currentTimeMillis();

		for (int i = 0; i < passwords.length; i++) {
			passwords[i] = generatePassword(length);
		}
		// long end = System.currentTimeMillis();
		// System.out.println(end - start / 1000);
		return passwords;
	}

	private static void printArray(String[] passwords) {
			for (String password : passwords) {
			System.out.print(password + " ");
		}
	}
}