package part6.ObjectsOnAList.Stack2;

import java.util.ArrayList;

public class Stack {

	private ArrayList<String> stacks;

	public Stack() {
		this.stacks = new ArrayList<>();
	}

	// returns a boolean-type value (true or false) that tells whether or not the
	// stack is empty.
	public boolean isEmpty() {

		if (this.stacks.isEmpty())
			return true;

		return false;

	}

	// Adds the value given as a parameter to the top of the stack.

	public void add(String value) {

		this.stacks.add(value);

	}

	// returns the values ​​contained in the stack as a list.

	public ArrayList<String> values() {

		return this.stacks;
	}

	// returns the topmost value (i.e., the last value added to the deque)
	// and removes it from the stack
	public String take() {

		String lastElement = this.stacks.get(this.stacks.size() - 1);
		this.stacks.remove(this.stacks.size() - 1);
		return lastElement;

	}

}
