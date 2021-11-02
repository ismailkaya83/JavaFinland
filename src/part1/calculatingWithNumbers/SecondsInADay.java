package part1.calculatingWithNumbers;

import java.util.Scanner;

public class SecondsInADay {

	public static void main(String[] args) {

		// In the exercise template, implement a program that asks the user for the
		// number of days. After that, the program prints the number of seconds in the
		// given number of days.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many days would you like to convert to seconds?");
		int number = Integer.valueOf(scanner.nextLine());
		System.out.println(number * 86400);

	}

}
