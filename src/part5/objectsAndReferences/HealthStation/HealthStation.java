package part5.objectsAndReferences.HealthStation;

public class HealthStation {

	private int countWeights;

	public HealthStation() {
		this.countWeights = 0;
	}

	public int weigh(Person person) {
		// return the weight of the person passed as the parameter
		this.countWeights = this.countWeights + 1;
		return person.getWeight();
	}

	public void feed(Person person) {
		int initialWeight = person.getWeight();
		person.setWeight(initialWeight + 1);

	}

	public int weighings() {

		return countWeights;
	}

}
