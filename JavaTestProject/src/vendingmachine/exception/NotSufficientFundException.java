package vendingmachine.exception;

public class NotSufficientFundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotSufficientFundException(String message) {
		super(message);
	}
}
