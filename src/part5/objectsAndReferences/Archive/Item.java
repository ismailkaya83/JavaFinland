package part5.objectsAndReferences.Archive;

public class Item {

	private String identifier;
	private String name;

	public Item(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return identifier + ": " + name;
	}

	// otomatik gelen

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}

	// manuel yapilan

	/*
	 * public boolean equals(Object compared) { // if the variables are located in
	 * the same position, they are equal if (this == compared) { return true; }
	 * 
	 * // if the compared object is not of type Items, the objects are not equal if
	 * (!(compared instanceof Item)) { return false; }
	 * 
	 * // convert the object to a Items object Item comparedBird = (Item) compared;
	 * 
	 * // if the values of the object variables are equal, the objects are, too
	 * return this.identifier.equals(comparedBird.identifier);
	 */

}
