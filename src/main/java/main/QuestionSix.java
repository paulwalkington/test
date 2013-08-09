package main;

public class QuestionSix {

	private static final int ONE = 1;

	public static int[][] roateMatrix(int[][] matrix) {
		int numberOfRows = matrix.length;
		int numberOfColumns = matrix.length;

		int[][] result = new int[numberOfRows][numberOfColumns];

		for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
			for (int rowNumber = 0; rowNumber < numberOfRows; rowNumber++) {
				result[rowNumber][numberOfColumns - columnNumber - ONE]=matrix[columnNumber][rowNumber];				
			}			
		}
		return result;
	}
}
