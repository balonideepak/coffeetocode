package scjp.array;

public class ValAssignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] ABC;
		ABC=new int[5];
		
		for(int a=0;a<ABC.length;a++){
			ABC[a]=ABC[a]+a;
		}
		
		for(int j=0;j<=ABC.length;j++){// Runtime Exception because of ArrayIndexOutOfBoundsException
			System.out.println(ABC[j]);
		}
	}

}
