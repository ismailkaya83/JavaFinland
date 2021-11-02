package part5.learningOOP;

public class Timer {

	private ClockHand seconds;
	private ClockHand hundrethsSeconds;

	public Timer() {

		this.seconds = new ClockHand(60);
		this.hundrethsSeconds = new ClockHand(100);

	}

	public void advance() {
		this.hundrethsSeconds.advance();

		if (this.hundrethsSeconds.value() == 0) {
			this.seconds.advance();

		}
	}

	public String toString() {

		return seconds + ":" + hundrethsSeconds;

	}
}
