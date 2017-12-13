package serializationandfinal;

import java.util.HashMap;
import java.util.Map;

public final class FinalClass {

	private final String id;
	private final String name;
	private final HashMap<String, String> map;

	public FinalClass(String id, String name, HashMap<String, String> map) {
		this.id = id;
		this.name = name;
		this.map = map;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getMap() {
		return (HashMap<String, String>) map.clone();
	}

}
