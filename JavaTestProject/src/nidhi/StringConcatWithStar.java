package nidhi;

public class StringConcatWithStar {

	public static void main(String[] arg) {

		String s1 = "abc";
		String s2 = "def";
		String S3 = "**";
		String result;
		result = s1.concat(s2);
		// result can be calculated via result=s1+s2; also

		for (int i = 1; i < 4; i++) {
			System.out.println("Executing for i ="+i+" "+S3 + result + S3);
		}

	for (int j = 1;j<4; j++){
		System.out.println(S3+result+S3+"-->"+"Executed on line number "+j+" "+"for you my love..happy ???");
		
		
		
	}

	}
}
