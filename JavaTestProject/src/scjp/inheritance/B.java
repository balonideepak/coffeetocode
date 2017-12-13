package scjp.inheritance;

class B extends A {
	static {
		System.out.println("B class static block ");
	}
	
	{
		System.out.println("B class init block ");
	}

	public B() {
		System.out.println("B class constructor ");
	}

	
}
