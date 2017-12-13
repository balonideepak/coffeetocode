package reflection;

public class Example {
	String str = "Hello World";

	  private void message(){System.out.println("hello java"); }  
	
	private void callMe() {
		System.out.println("private method callMe called");
	}

	public  void callMeWithParams(int i) {
		System.out.println("callMeWithParams called with param="+i);
	}
	
	public void callMeWithoutParams() {
		System.out.println("callMeWithoutParams called");
	}
	
}
