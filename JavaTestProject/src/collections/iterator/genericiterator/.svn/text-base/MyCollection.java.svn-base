package collections.iterator.genericiterator;

import java.util.Iterator;

public class MyCollection<E> implements Iterable<E> {

	private Object[] arr = null;
	private int count = 0;
	private int size = 0;
	private int position = 0;

	public MyCollection() {
	}

	public MyCollection(int size) {
		this.size = size;
		arr = new Object[this.size];
	}

	public void add(E e) {
		arr[count++] = e;
	}

	public Iterator<E> iterator() {
		return new MyIterator<E>();
	}

	private class MyIterator<E> implements Iterator<E> {

		public boolean hasNext() {
			if (position < size)
				return true;
			else
				return false;
		}

		public E next() {
			E obj = (E) arr[position];
			position++;
			return obj;

		}

		public void remove() {
			try {
				position--;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}

}
