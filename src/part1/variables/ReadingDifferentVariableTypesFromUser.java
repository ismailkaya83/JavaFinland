package part1.variables;

import java.util.Scanner;

public class ReadingDifferentVariableTypesFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// READING INTEGER
		System.out.println("Write a value ");
		int value = Integer.valueOf(scanner.nextLine()); // The Integer.valueOf command converts a string to an integer.
		System.out.println("You wrote " + value);

		// READING STRING
		System.out.println("Write text and press enter ");
		String text = scanner.nextLine(); // the user's input is always read as a string, since the user writes their
											// input as text. Other input types, such as integers, doubles, and booleans
											// are also read as text. However, they need to be converted to the target
											// variable's type with the help of some tools provided by Java.
		System.out.println("You wrote " + text);

		// READING DOUBLE
		System.out.println("Write a value ");
		double value1 = Double.valueOf(scanner.nextLine());
		System.out.println("You wrote " + value1);

		// READING BOOLEANS
		System.out.println("Write a boolean ");
		boolean value2 = Boolean.valueOf(scanner.nextLine());
		System.out.println("You wrote " + value2); // When converting a string to a boolean, the string must be "true"
													// if we want the boolean value to be true. The case is insensitive
													// here: both "true" and "TRue" turn into the boolean value of true.
													// All other strings turn into the boolean false.
	}
}