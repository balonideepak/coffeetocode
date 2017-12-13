package geeksforgeeks.medium;

//http://www.geeksforgeeks.org/rearrange-characters-string-no-two-adjacent/

public class RearrangeCharacters {
	public static void main(String[] args) {
		String str = "aaabc";
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				int startpoint = i + 1;
				for (int j = startpoint; j < arr.length; j++) {
					if (j + 1 < arr.length && arr[startpoint] != arr[j + 1]) {
						char temp = arr[j + 1];
						arr[j + 1] = arr[startpoint];
						arr[startpoint] = temp;
						break;
					}
				}
			}
		}
		System.out.println(arr);
	}
}
