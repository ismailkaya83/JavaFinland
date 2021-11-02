package part1.variables;

import java.util.Scanner;

public class IntegerInput {

	public static void main(String[] args) {
		// Write a program that asks the user for a value. The program should then print
		// the value provided by the user.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give a number:");
		int value = Integer.valueOf(scanner.nextLine());
		System.out.println("You gave the number " + value);

	}

}
