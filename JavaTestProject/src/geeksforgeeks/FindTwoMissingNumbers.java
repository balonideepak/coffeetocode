package geeksforgeeks;

public class FindTwoMissingNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6 };
		findTwoMissingNumbers(arr);
	}

	private static void findTwoMissingNumbers(int a[]) {
		int B = a.length + 2;
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			x = x ^ a[i];
		}
		for (int i = 1; i <= B; i++) {
			x = x ^ i;
		}
		
		System.out.println("x="+x+" , x-1="+(x - 1));
		x = x & (~(x - 1));
		
		System.out.println(x);
		int p = 0, q = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] & x) == x) {
				p = p ^ a[i];
			} else {
				q = q ^ a[i];
			}
		}
		for (int i = 1; i <= B; i++) {
			if ((i & x) == x) {
				p = p ^ i;
			} else {
				q = q ^ i;
			}
		}

		System.out.println("p: " + p + " : " + q);
	}
}
