package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfStringANumber {
public static void main(String[] args) {
	String input="s123";
	boolean isValid=false;
	String expression="[-+]?[0-9]+\\.?[0-9]$";
	Pattern pattern=Pattern.compile(expression);
	Matcher matcher = pattern.matcher(input);
	if(matcher.matches()){
		isValid=true;
	}
	System.out.println("input ::"+input+"  is "+isValid+" number");
	
}
}
