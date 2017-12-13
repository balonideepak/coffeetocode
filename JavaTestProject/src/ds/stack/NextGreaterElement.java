package ds.stack;

public class NextGreaterElement {
	char nextGreaterElemOf = '4';
	char[] charInputArr = { '1', '4', '5', '9' };

	public void setNextGreaterElemOf(char nextGreaterElemOf) {
		this.nextGreaterElemOf = nextGreaterElemOf;
	}

	public void setCharInputArr(char[] charInputArr) {
		this.charInputArr = charInputArr;
	}

	public static void main(String[] args) {
		char nextGreaterElem = new NextGreaterElement().findNextGreaterElem();
		System.out.println(nextGreaterElem);
	}

	public  char  findNextGreaterElem() {
		StackX<Character> stack = new StackX<>(5);
		for (char c : charInputArr) {
			stack.push(c);
		}

		char nextGreaterElem = '0';
		while (!stack.isEmpty()) {
			char elem = stack.pop();
			if (elem == nextGreaterElemOf) {
				break;
			} else {
				if (elem > nextGreaterElemOf) {
					nextGreaterElem = elem;
				}

			}
		}
		
		return nextGreaterElem;

	}

}
