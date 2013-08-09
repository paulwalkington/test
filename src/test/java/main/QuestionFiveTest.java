package main;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

public class QuestionFiveTest {

	@Test
	public void testShortenString()
	{
		Assert.assertThat(QuestionFive.shortenString("aaaabbbcccccd"), is("a4b3c5d1"));
		Assert.assertThat(QuestionFive.shortenString("Aaaabbbcc"), is("A1a3b3c2"));
		Assert.assertThat(QuestionFive.shortenString("abcde"), is("abcde"));
	}
	
}
