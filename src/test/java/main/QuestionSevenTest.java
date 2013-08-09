package main;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import main.QuestionSeven;

import org.junit.Test;

public class QuestionSevenTest {

	
	@Test
	public void testOneZero()
	{
		int[][] matrix = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };
		int[][] expectedmatrix = { { 0, 0, 0 }, { 0, 4, 5 }, { 0, 7, 8 }, { 0, 10, 11 } };
		
		QuestionSeven.zeroMatrix(matrix);
		
		assertThat(QuestionSeven.zeroMatrix(matrix), is(expectedmatrix));
	}
	
	@Test
	public void testTwoZeroOnSameRow()
	{
		int[][] matrix = { { 0, 0, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };
		int[][] expectedmatrix = { { 0, 0, 0 }, { 0, 0, 5 }, { 0, 0, 8 }, { 0, 0, 11 } };
		
		QuestionSeven.zeroMatrix(matrix);
		
		assertThat(QuestionSeven.zeroMatrix(matrix), is(expectedmatrix));
	}
	
	@Test
	public void testTwoZeroOnSameColumn()
	{
		int[][] matrix = { { 0, 1, 2 }, { 0, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };
		int[][] expectedmatrix = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 7, 8 }, { 0, 10, 11 } };
		
		QuestionSeven.zeroMatrix(matrix);
		
		assertThat(QuestionSeven.zeroMatrix(matrix), is(expectedmatrix));
	}
}
