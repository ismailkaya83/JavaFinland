package part5.learningOOP;

public class ClockMain {

	public static void main(String[] args) {
		
		Clock clock = new Clock();

		while (true) {
		    System.out.println(clock);
		    clock.advance();
		}

	}

}
