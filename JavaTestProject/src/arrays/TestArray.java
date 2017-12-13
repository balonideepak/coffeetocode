package arrays;

public class TestArray {

	/**
	 * @author deepak.baloni 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] strarr={"a","b"};
//		Object[] obj=strarr;
//		obj[0]=new Object();
		
		
		
		
		int ia[][] = { {1, 2}, null };
		for (int[] ea : ia)
			for (int e: ea)
				System.out.println(e);
		
		
		System.out.println("Done");
		
	}

}
