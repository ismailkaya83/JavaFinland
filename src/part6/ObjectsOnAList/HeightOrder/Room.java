package part6.ObjectsOnAList.HeightOrder;

import java.util.ArrayList;

public class Room {

	private ArrayList<Person> persons;

	public Room() {

		this.persons = new ArrayList<>();
	}

	// add the person passed as a parameter to the list.

	public void add(Person person) {

		this.persons.add(person);

	}

	// returns a boolean-type value true or false, that tells whether the room is
	// empty or not.

	public boolean isEmpty() {

		if (this.persons.isEmpty())
			return true;

		return false;

	}

	// returns a list of the persons in the room.

	public ArrayList<Person> getPersons() {

		return this.persons;

	}

	public Person shortest() {

		if (this.persons.isEmpty())
			return null;

		Person shortest = this.persons.get(0);

		for (Person prs : this.persons) {
			if (shortest.getHeight() > prs.getHeight()) {
				shortest = prs;

			}
		}
		
		return shortest;

	}
	
	public Person take() {
		
		Person shortestPerson = shortest();
		
        this.persons.remove(shortestPerson);
        
        return shortestPerson;
        
	}

}
