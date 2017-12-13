package geeksforgeeks;

public class FindMSD {

	public static void main(String[] args) {
		int i = 1234;
		int num = i;
		int MSD = 0;
		do {
			if (num / 10 == 0) {
				MSD = num;
			}
			num = num / 10;

		} while (num > 0);

		System.out.println(MSD);
		System.out.println("Other solution");
		System.out.println(String.valueOf(i).charAt(0));
	}

}
