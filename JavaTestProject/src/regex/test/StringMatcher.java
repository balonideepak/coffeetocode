package regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

	public boolean isTrue(String str) {
		return str.matches("true");
	}

	public boolean isTrueVer2(String str) {
		return str.matches("[tT]rue");
	}

	public boolean isTrueOrYes(String str) {
		return str.matches("[tT]rue|[yY]es");
	}

	public boolean containsSpecialCharacters(String str) {
		return str.matches("[!@#$%^&*].*");
	}

	public boolean containsSpecialCharactersVer2(String str) {
		return str.matches("[^a-zA-Z0-9]*");
	}

	public void conatinsNonAlphaNumeric(String str) {
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
