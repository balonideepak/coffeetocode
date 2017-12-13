package scjp.collection;

import java.util.HashSet;

public class SetAddExample {
	public static void main(String[] args) {
		HashSet myMap = new HashSet();
		String s1 = new String("das");
		String s2 = new String("das");
		NameBean s3 = new NameBean("abcdef");
		NameBean s4 = new NameBean("abcdef");

		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);

		System.out.println(myMap);
	}
}

class NameBean {
	private String str;

	NameBean(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}

	/***
	 * Uncomment the below , then Set will allow only unique value . If
	 * uncommented only one method then also the equals and hash-code violation
	 * will happen and it will allow to add dups also
	 * *****/
	
	/******
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameBean other = (NameBean) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
	*****************/

}
