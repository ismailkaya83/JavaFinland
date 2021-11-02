package part4.IntroductionOOP;

public class Film {

	// instance variables

	private String name;

	private int ageRating;

	// constructor

	public Film(String filmName, int filmAgeRating) {

		this.name = filmName;
		this.ageRating = filmAgeRating;

	}

	public String name() {

		return this.name;

	}

	public int ageRating() {

		return this.ageRating;

	}

}
