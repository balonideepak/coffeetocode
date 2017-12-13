package nidhi;

public class StringIndexValuePrint {
	public static void main(String[] arg) {

		String s = "abc";
		int length =s.length();

		System.out.println("String length="+length);
		for(int i=0;i< length;i++){
			System.out.println(s.charAt(i));
		}
		
	}
}
