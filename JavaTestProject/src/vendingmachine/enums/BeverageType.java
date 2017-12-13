package vendingmachine.enums;

public enum BeverageType {
	COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);
	private String beverageName;
	private int beveragePrice;

	private BeverageType(String name, int price) {
		this.beverageName = name;
		this.beveragePrice = price;
	}

	public String getName() {
		return beverageName;
	}

	public int getPrice() {
		return beveragePrice;
	}

	public void setPrice(int beveragePrice) {
		this.beveragePrice = beveragePrice;
	}

}
