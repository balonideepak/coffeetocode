package regex.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegex {
	StringMatcher matcher = new StringMatcher();

	@Test
	public void testIsTrue() {
		assertTrue(matcher.isTrue("true"));
	}
	
	
	@Test
	public void isTrueVer2() {
		assertTrue(matcher.isTrueVer2("true"));
	}
	
	@Test
	public void isTrueOrYes() {
		assertTrue(matcher.isTrueOrYes("yes"));
	}
	
	@Test
	public void containsSpecialCharacters(){
		assertTrue(matcher.containsSpecialCharacters("@str#$%%"));
	}
	
	@Test
	public void containsSpecialCharactersVer2(){
		assertTrue(matcher.containsSpecialCharactersVer2("@#%%%"));
	}
	
	
	@Test
	public void conatinsNonAlphaNumeric(){
		matcher.conatinsNonAlphaNumeric("@#$%%");
	}

}
