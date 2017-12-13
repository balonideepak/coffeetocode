package regex;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestRegex lObj = new TestRegex();
		lObj.testRegex();
		
		
	}

	void testRegex() {
		String EXAMPLE_TEST = "This is my small example ";

		System.out.println("Is Match  : " + EXAMPLE_TEST.matches("\\w.*"));

		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);

		while (matcher.find()) {
			System.out.print("Start " + matcher.start());
			System.out.print(" , End " + matcher.end());
			System.out.println(" , Group :" + matcher.group());

		}

		String pattern1 = "\\d\\d\\d([-,\\s])?\\d\\d\\d\\d";
		String s = "1233323322";
		System.out.println(s.matches(pattern1));
		s = "1233323";
		System.out.println(s.matches(pattern1));
		s = "123 3323";
		System.out.println(s.matches(pattern1));
		s = "123-3323";
		System.out.println(s.matches(pattern1));

		URL url;
		try {
			url = new URL(
					"http://obll2351e2876:7001/aslan/aslan/control/SongDetails.jsp");

			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			/*
			 * OutputStreamWriter wr = new OutputStreamWriter(
			 * conn.getOutputStream()); wr.write(url.getFile());
			 */
			Map<String, List<String>> headerFields = conn.getHeaderFields();
			Set<Entry<String, List<String>>> entrySet = headerFields.entrySet();
			for (Entry<String, List<String>> entry : entrySet) {
				System.out.println(entry.getKey() + entry.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
