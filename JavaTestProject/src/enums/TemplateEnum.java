package enums;

public enum TemplateEnum {
	EAST(0) {
		public void shout() {
			System.out.println("EAST");
		}
	},
	WEST(0) {
		public void shout() {
			System.out.println("WEST");
		}
	},
	SOUTH(0) {
		public void shout() {
			System.out.println("SOUTH");
		}
	},

	NORTH(0) {
		public void shout() {
			System.out.println("NORTH");
		}
	};

	private int angle;

	private TemplateEnum(int angle) {
		this.angle = angle;
	}

	public int getAngle() {
		return angle;
	}

	public abstract void shout();

}
