package main;

public class QuestionFive {

	public static String shortenString(String word) {
		int count = 0;
		char currentLetter = word.charAt(0);
		StringBuilder shortenWord = new StringBuilder();

		for (char c : word.toCharArray()) {
			if (currentLetter != c) {
				shortenWord.append(currentLetter).append(count);
				count = 0;
				currentLetter = c;
			}
			count++;
		}

		shortenWord.append(currentLetter).append(count);

		return returnShortestWord(word, shortenWord);
	}

	private static String returnShortestWord(String word,
			StringBuilder shortenWord) {
		return shortenWord.toString().length() > word.length() ? word
				: shortenWord.toString();
	}
}
