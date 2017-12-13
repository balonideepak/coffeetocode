/**
 * 
 */
package amazing;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class OpenDefaultBrowser {
	private static final String errMsg = "ERROR WHILE ATTEMPTEING TO LUNCH WEB BROWSER";
	private static final String errFindingBrowser="COULD NOT FIND THE BROWSER";
	
	public static void main(String args [])
	{
		String urlToOpen="http://www.google.com/";
		openURL(urlToOpen);
	}

	/**
	 * This method takes URL as a parameter and tries to
	 * identify Operating system and then lunches the broswer
	 * with the given URL
	 */
	public static void openURL(String url) {
		String operatingSystem = System.getProperty("os.name");
		try {
			/*
			 * Check if it is windows OS 
			 */
			if (operatingSystem.startsWith("Windows"))
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			/*
			 * If not windows OS, Check if it is a Mac OS
			 */
			else if (operatingSystem.startsWith("Mac OS")) {
				Class fileManager = Class.forName("com.apple.eio.FileManager");
				Method openURL = fileManager.getDeclaredMethod("openURL",
						new Class[] { String.class });
				openURL.invoke(null, new Object[] { url });
			}
			
			/*
			 * Or, it might be some unix or linux OS
			 */
			else { 
				/**
				 * There are different browsers possible.
				 */
				String[] browsers = { 	"firefox", 
										"netscape",
										"opera", 
										"konqueror", 
										"epiphany", 
										"mozilla"};
				String browser = null;
				
				for (int count = 0; count < browsers.length && browser == null; count++)
					if (Runtime.getRuntime().exec(
							new String[] { "which", browsers[count] })
							.waitFor() == 0)
						browser = browsers[count];

				if (browser == null) 
					throw new Exception(errFindingBrowser);
				else
					Runtime.getRuntime().exec(new String[] { browser, url });
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, errMsg + ":\n" + e.getMessage());
		}
	}

}
