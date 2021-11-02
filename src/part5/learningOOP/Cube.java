package part5.learningOOP;

public class Cube {

	// instance variables
	private int edgeLength;

	// constructor
	public Cube(int edgeLength) {
		this.edgeLength = edgeLength;

	}

	// methods
	public int volume() {
		return edgeLength * edgeLength * edgeLength;

	}

	public String toString() {
		return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
	}
}
