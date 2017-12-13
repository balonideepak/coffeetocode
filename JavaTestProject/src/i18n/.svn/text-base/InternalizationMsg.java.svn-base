package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternalizationMsg {

	/**
	 * @author deepak.baloni
	 * @param args
	 */
	public static void main(String[] args) {
		String language;
		String country;

		System.out.println("[INFO]:: Possible values of language and country can be checked from MessagesBundle property file..");
		
		if (args.length != 2) {
			language = new String("en");//de
			country = new String("US");//DE
		} else {
			language = new String(args[0]);
			country = new String(args[1]);
		}
		
		Locale currentLocale=new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		System.out.println(resourceBundle.getString("greetings"));
	    System.out.println(resourceBundle.getString("inquiry"));
	    System.out.println(resourceBundle.getString("farewell"));

	}
}
