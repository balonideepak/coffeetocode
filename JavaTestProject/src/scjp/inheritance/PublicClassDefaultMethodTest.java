package scjp.inheritance;

import scjp.PublicClassDefaultMethod;

public class PublicClassDefaultMethodTest {
	public static void main(String[] args) {
		PublicClassDefaultMethod obj = new PublicClassDefaultMethod();
		//Compilation error as callme() method not visible >>>>>>  obj.callme();
	}
}
