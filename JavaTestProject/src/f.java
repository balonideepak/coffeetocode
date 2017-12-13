import java.io.UnsupportedEncodingException;

import javax.xml.bind.DatatypeConverter;

public class f {

	public static void main(String a[]) throws UnsupportedEncodingException {

		String str = new String(DatatypeConverter.parseBase64Binary("user:123"));
		String printBase64Binary = DatatypeConverter
				.printBase64Binary("用户的unicode".getBytes("UTF-8"));
		String res = DatatypeConverter.printBase64Binary(str.getBytes());
		System.out.println(res);
		System.out.println(printBase64Binary);
	}
}