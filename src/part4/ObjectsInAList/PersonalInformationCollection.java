package part4.ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		// implement here your program that uses the PersonalInformation class

		ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Read person information from the user
		while (true) {
			System.out.println("First name: ");
			String firstName = scanner.nextLine();

			if (firstName.isEmpty()) {
				break;
			}

			System.out.println("Last name: ");
			String lastName = scanner.nextLine();

			System.out.println("Identification number: ");
			String idNumber = scanner.nextLine();

			infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));

		}

		System.out.println();
		for (PersonalInformation person : infoCollection) {
			System.out.println(person);
		}

	}
}
