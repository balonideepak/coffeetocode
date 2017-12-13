package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpace {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {

		String input="Space with          multiple     spaces is the    input";
		System.out.println("[Message]:: Input was ::"+input);
		String expression="(\\s+)";
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(input);
		input=matcher.replaceAll(" ");
		System.out.println("[Message]:: Output is ::"+input);
		
	}

}
