package part4.IntroductionOOP;

public class Statistics {

	// instance variable
	private int count;
	private int sum;

	// constructor
	public Statistics() {
		// initialize the variable numberCount here

		this.count = 0;
		this.sum = 0;

	}

	public void addNumber(int number) {
		// write code here

		this.count = this.count + 1;
		this.sum = this.sum + number;

	}

	public int getCount() {
		// write code here

		return this.count;

	}
	
	public int sum() {
		
		return this.sum;
	}
	
	public double average() {
		
		if(this.count == 0) {
			return 0;
		}
		
		return 1.0 * this.sum / this.count;
		
	}
	
	

}
