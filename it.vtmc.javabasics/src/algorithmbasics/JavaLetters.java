package algorithmbasics;

import java.util.Arrays;

public class JavaLetters {
	public static void main(String[] args) {
		String text = "This is a text for a simple task of counting each letter";
		countLetters(text);
		bouildLettersDictionary(text);
	}

	private static void countLetters(String text) {
		text = text.toLowerCase();
		char[] chars = text.toCharArray();

		char[] allChars = new char[26];
		int[] charCount = new int[26];
		int index = 0;
		int count = 0;

		for (int i = 97; i <= 122; i++) {
			allChars[index] = ((char) (i));
			for (int z = 0; z < chars.length; z++) {
				if (chars[z] == ((char) (i))) {
					count++;
				}

			}
			charCount[index] = count;
			count = 0;
			index++;
		}
		System.out.println(Arrays.toString(allChars));
		System.out.println(Arrays.toString(charCount));

	}

	// Destytojo budas:

	private static void bouildLettersDictionary(String text) {
		int[] chars = new int['z' - 'a' + 1];
		for (int i = 0; i < text.length(); i++) {
			char charValue = text.charAt(i);
			if (charValue >= 'a' && charValue <= 'z') {
				chars[charValue - 'a']++;
			}
		}
		for (int i = 0; i < chars.length; i++) {
			System.out.print((char) (i + 'a') + "=" + chars[i]);
		}
	}
}
