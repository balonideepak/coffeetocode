package ds.stack;

class StackX<T> {

	private T itemsArr[];
	private int top = -1;

	public StackX(int size) {
		itemsArr = (T[]) new Object[size];
	}

	public void push(T item) {
		top++;
		itemsArr[top] = item;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T pop() {
		T t = itemsArr[top];
		itemsArr[top]=null;
		top--;
		return t;
	}
	
	
	public T peek() {
		T t = itemsArr[top];
		return t;
	}
	
	public int top(){
		return top;
	}
	
}
