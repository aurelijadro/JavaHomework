package it.vtmc.javabasics;

public class JavaPasswordsGenerator {

	public static void main(String[] args) {
		generatePassword(8);
		String[] passwordsArray = new String[3000000]; // 3000000milijonai slaptazodziu turi buti unikalus
		// surusiuoti masyva?

	}

	private static void generatePassword(int passwordLength) {
		char[] passwordChars = new char[passwordLength];
		String password = "";
		for (int i = 0; i < passwordLength; i++) {
			passwordChars[i] = randomChar();
			password += (Character.toString(passwordChars[i]));
		}
		System.out.println(password);

	}

	private static char randomChar() {
		char character = (char) (Math.random() * 126 + 1);
		return character;

	}

}
