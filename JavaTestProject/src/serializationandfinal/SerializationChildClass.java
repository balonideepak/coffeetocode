package serializationandfinal;

import java.io.IOException;
import java.io.NotSerializableException;

public class SerializationChildClass extends SerializationSuperClass {

	public int i;

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		throw new NotSerializableException("Can not serialize this class");
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		throw new NotSerializableException("Can not serialize this class");
	}

}
