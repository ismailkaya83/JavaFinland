package part5.learningOOP;

public class Fitbyte {

	//instance variables
	private int age;
	private int restingHeartRate;
	
	//constructor
	public Fitbyte(int age, int restingHeartRate) {
		this.age = age;
		this.restingHeartRate = restingHeartRate;
	}

	//methods
	public double targetHeartRate(double percentageOfMaximum) {
		double maximumHeartRate = 206.3 - (0.711 * age);
		return (maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
	}

}
