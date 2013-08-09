package main;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

public class QuestionSixTest {

	@Test
	public void testRotateMatrixNinetyDegrees() {
		int[][] matrix = { //
		        { 1, 2, 3, 4 },//
				{ 6, 7, 8, 9 },//
				{ 10, 11, 12, 13 }, //
				{ 14, 15, 16, 17 } //
		};
		
		int[][] expectedMatrix = { //
		{ 14, 10, 6, 1 },//
				{ 15, 11, 7, 2 },//
				{ 16, 12, 8, 3 }, //
				{ 17, 13, 9, 4 } //
		};
		
		Assert.assertThat(QuestionSix.roateMatrix(matrix), is(expectedMatrix));
		
		
	}

}
