package part1.conditionalStatement;

import java.util.Scanner;

public class comparingStrings {

	public static void main(String[] args) {
		
		/*
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the first string");
		String first = reader.nextLine();
		System.out.println("Enter the second string");
		String second = reader.nextLine();

		if (first == second) {
		    System.out.println("The strings were the same!");
		} else {
		    System.out.println("The strings were different!");
		}
		*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input two strings");
		String first = reader.nextLine();
		String second = reader.nextLine();

		if (first.equals(second)) {
		    System.out.println("The strings were the same!");
		} else {
		    System.out.println("The strings were different!");
		}

		if (first.equals("two strings")) {
		    System.out.println("Clever!");
		}

		if (second.equals("two strings")) {
		    System.out.println("Sneaky!");
		}

	}

}
