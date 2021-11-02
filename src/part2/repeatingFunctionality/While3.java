package part2.repeatingFunctionality;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// Write a program that asks the user for numbers. If the number is negative
		// (smaller than zero), the program prints for user "Unsuitable number" and asks
		// the user for a new number. If the number is zero, the program exits the loop.
		// If the number is positive, the program prints the number to the power of two.

		// The task is to read an input from the user
		Scanner scanner = new Scanner(System.in);

		// The task is to repeat the block until the block is exited
		while (true) {
			// The task is to ask the user for an input
			System.out.println("Input a number ");
			// The task is to read a number from the user
			int number = Integer.valueOf(scanner.nextLine());

			// The task is to guard and prevent unfit numbers
			// for further processing
			if (number < 0) {
				System.out.println("Unfit number");
				continue;
			}

			// The task is to check if the loop should be exited
			if (number == 0) {
				break;
			}

			// The task is to print the square of the number
			System.out.println(number * number);
		}
		
		// ANOTHER SOLUTION
		while (true) {
		    // The task is to ask the user for an input
		    System.out.println("Input a number ");
		    // The task is to read a number from the user
		    int number = Integer.valueOf(scanner.nextLine());

		    // The purpose of the if-else if-else block?
		    // The task is the processing of the number?
		    if (number < 0) {
		        System.out.println("Unfit number");
		    } else if (number == 0) {
		        break;
		    } else {
		        System.out.println(number * number);
		    }
		}
	}

}
