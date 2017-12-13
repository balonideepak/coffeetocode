package exceptions;

public class TestExceptions {

	public static void main(String[] args) {
		try {
			int arr[] = new int[-2];
			//arr[10] = 123;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
