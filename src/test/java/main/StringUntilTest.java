package main;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

public class StringUntilTest {

	@Test
	public void testUniqueCharactersTrue() {
		Assert.assertThat(StringUntil.hasUniqueCharacters("paul"), is(true));
	}

	@Test
	public void testUniqueCharactersFalse() {
		Assert.assertThat(StringUntil.hasUniqueCharacters("David"), is(false));
	}

	@Test
	public void testUniqueCharactersNoCollectionTrue() {
		Assert.assertThat(StringUntil.hasUniqueCharactersNoCollection("paul"),
				is(true));
	}

	@Test
	public void testUniqueCharactersNoCollectionFalse() {
		Assert.assertThat(StringUntil.hasUniqueCharactersNoCollection("David"),
				is(false));
	}

	@Test
	public void testStringsHaveSameLettersSameLength() {
		Assert.assertThat(StringUntil.sameLetters("paul", "ualp"), is(true));
	}
	
	@Test
	public void testStringsHaveSameLettersDifferentLengths() {
		Assert.assertThat(StringUntil.sameLetters("paul", "ualpqw"), is(false));
	}
	
	@Test
	public void testStringsHaveSameLettersDifferentLetters() {
		Assert.assertThat(StringUntil.sameLetters("paul", "erty"), is(false));
	}
	

	@Test
	public void testRemoveWhiteSpaces()
	{
		Assert.assertThat(StringUntil.removeWhiteSpaces("hello my name is paul"), is("hello%20my%20name%20is%20paul"));
		Assert.assertThat(StringUntil.removeWhiteSpaces(" hello"), is("hello"));
		Assert.assertThat(StringUntil.removeWhiteSpaces(" hello    my       name is     paul "), is("hello%20my%20name%20is%20paul"));
	}

}
