package ds.stringsearching;

public class RemoveAdjacentDups {
	public static void main(String[] args) {
		String string = "aabcd";
		char str[] = string.toCharArray();
		int j = 0;
		for (int i = 1; i < str.length; i++) {
			while (str[j] == str[i] && j >= 0) {
				i++;
				j--;
			}
			str[++j] = str[i];
		}
		for (int i = 0; i < j; i++)
			System.out.print(str[i]);
	}
}
