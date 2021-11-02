package part5.removingRepetitiveCode;

public class Counter {
	
	private int startValue = 0;

	//constructors
	public Counter(int startValue) {
		this.startValue = startValue;
	}

	public Counter() {
		this(0);
	}
	
	// methods

	public int value() {
		return this.startValue;
	}

	public void increase() {
		increase(1);
	}

	public void decrease() {
		decrease(1);
	}
	
	public void increase(int increaseBy) {
		if (increaseBy > 0) {
			this.startValue = this.startValue + increaseBy;
		}
	}
	
	public void decrease(int decreaseBy) {
		if (decreaseBy > 0) {
			this.startValue = this.startValue - decreaseBy;
		}
	}

}
