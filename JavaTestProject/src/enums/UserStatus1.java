package enums;

public enum UserStatus1 {
	PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");

	private String status;

	private UserStatus1(String status) {
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

}
