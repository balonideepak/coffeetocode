package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsensitiveSearch {

	public static void main(String[] args) {
		insensitiveSearch();
		findWord();
	}

	private static void insensitiveSearch() {
		System.out.println("Inside method insensitiveSearch.......");
		String string = "Hello world its a nice World isn't it javabrother ";
		Pattern pattern = Pattern.compile("\\bworld\\b",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {
			System.out.println("start index=" + matcher.start()
					+ " , end index=" + matcher.end() + " , word ="
					+ matcher.group());
		}
	}

	private static void findWord() {
		System.out.println("Inside method findWord.......");
		String string = "Hello world its a nice World isn't it worldly ";
		Pattern pattern = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {
			System.out.println("start index=" + matcher.start()
					+ " , end index=" + matcher.end() + " , word ="
					+ matcher.group());
		}
	}

}
