package main;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringUntil {

	private static final String WHITE_SPACE_STRING = "%20";

	public static String removeWhiteSpaces(String string) {
		StringTokenizer stringTokenizer = new StringTokenizer(string.trim());
		StringBuilder stringBuilder = new StringBuilder();
		int numberOfWords = stringTokenizer.countTokens();
		int count = 1;

		while (stringTokenizer.hasMoreTokens()) {
			stringBuilder.append(stringTokenizer.nextToken());

			if (count < numberOfWords) {
				stringBuilder.append(WHITE_SPACE_STRING);
			}
			count++;
		}

		return stringBuilder.toString();
	}
	
	public static boolean hasUniqueCharacters(String word) {
		Set<Character> letters = new HashSet<>();

		for (char c : word.toCharArray()) {
			letters.add(Character.toUpperCase(c));
		}

		return letters.size() == word.length() ? true : false;
	}

	public static boolean hasUniqueCharactersNoCollection(String word) {
		int wordLength = word.length();
		boolean result = true;

		for (int i = 0; i < wordLength; i++) {
			char firstLetter = Character.toUpperCase(word.charAt(i));
			for (int j = 1 + i; j < wordLength; j++) {
				char secondLetter = Character.toUpperCase(word.charAt(j));
				if (lettersEquals(firstLetter, secondLetter)) {
					result = false;
				}
			}
		}

		return result;
	}

	public static boolean sameLetters(String wordOne, String wordTwo) {
		boolean result = false;
		int wordOneLength = wordOne.length();
		int wordTwoLength = wordTwo.length();

		if (wordOneLength == wordTwoLength) {
			int numberOfSameLetter = 0;

			for (int i = 0; i < wordOneLength; i++) {
				char wordOneLetter = wordOne.charAt(i);
				for (int j = 0; j < wordTwoLength; j++) {
					char wordTwoLetter = wordTwo.charAt(j);
					if (lettersEquals(wordOneLetter, wordTwoLetter)) {
						numberOfSameLetter++;
					}
				}
			}

			if (numberOfSameLetter == wordOneLength) {
				result = true;
			}
		}

		return result;
	}

	private static boolean lettersEquals(char firstLetter, char secondLetter) {
		return firstLetter == secondLetter ? true : false;
	}
}
