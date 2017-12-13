package designpattern.state;

//http://www.journaldev.com/1751/state-design-pattern-java
public class Test {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		context.setState(new TVStartState());
		context.doAction();

		context.setState(new TVStopState());
		context.doAction();
	}
}
