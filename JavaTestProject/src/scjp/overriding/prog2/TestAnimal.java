package scjp.overriding.prog2;

public class TestAnimal {
	public static void main(String[] args) {

	Animal a=new Horse();
	a.eat();
	
	Horse h=new Horse();
	h.eat();
	
	}
}
