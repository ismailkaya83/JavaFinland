package part4.IntroductionOOP;

public class Gauge {

	// instance variable
	private int value;

	// constructor without parameters (sets the initial value of the meter variable
	// to 0)

	public void increase() {

		if (this.value < 5) {
			this.value = this.value + 1;

		}

	}

	public void decrease() {

		if (this.value > 0) {

			this.value = this.value - 1;

		}

	}

	public int value() {

		return this.value;

	}

	public boolean full() {

		return this.value == 5;

	}

}
