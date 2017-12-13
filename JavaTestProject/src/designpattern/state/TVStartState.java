package designpattern.state;

public class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("starting...");
	}

}
