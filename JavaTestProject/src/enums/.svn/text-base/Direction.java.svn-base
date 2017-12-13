package enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Direction {
	EAST(0), WEST(1), NORTH(2), SOUTH(3);

	private int angle;

	private Direction(int direction) {
		this.angle = direction;
	}

	public int getAngle() {
		return angle;
	}

	private static final Map lookup = new HashMap();

	static {
		for (Direction s : EnumSet.allOf(Direction.class))
			lookup.put(s.getAngle(), s);
	}

	// This method can be used for reverse lookup purpose
	public static Direction get(int angle) {
		return (Direction) lookup.get(angle);
	}
}
