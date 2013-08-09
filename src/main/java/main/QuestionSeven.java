package main;

import java.util.HashSet;
import java.util.Set;

public class QuestionSeven {

	private static final int ZERO = 0;

	public static int[][] zeroMatrix(int[][] matrix) {
		int numberOfColumns = matrix[0].length;
		int numberOfRows = matrix.length;

		Set<Integer> zeroColumns = new HashSet<Integer>();
		Set<Integer> zeroRows = new HashSet<Integer>();

		int[][] result = new int[numberOfRows][numberOfColumns];

		for (int rowNumber = 0; rowNumber < numberOfRows; rowNumber++) {
			for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
				int value = matrix[rowNumber][columnNumber];
				result[rowNumber][columnNumber] = value;

				if (value == ZERO) {
					zeroColumns.add(new Integer(columnNumber));
					zeroRows.add(new Integer(rowNumber));
				}
			}
		}

		addZerosToColumns(matrix, zeroColumns);
		addZerosToRows(matrix, zeroRows);

		return result;
	}

	private static void addZerosToRows(int[][] matrix, Set<Integer> zeroRows) {
		int numberOfColumns = matrix[0].length;
		for (int rowNumber : zeroRows) {
			for (int columnNumber = 0; columnNumber < numberOfColumns; columnNumber++) {
				matrix[rowNumber][columnNumber] = ZERO;
			}
		}
	}

	private static void addZerosToColumns(int[][] matrix, Set<Integer> zeroColumns) {
		int numberOfRows = matrix.length;
		for (int columnNumber : zeroColumns) {
			for (int rowNumber = 0; rowNumber < numberOfRows; rowNumber++) {
				matrix[rowNumber][columnNumber] = ZERO;
			}
		}
	}

}
