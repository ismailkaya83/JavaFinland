package part2.repeatingFunctionality;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Input positive numbers.");
			int number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				break;
			}

			if (number < 0) {
				System.out.println("Unfit number! Try again.");
				continue;
			}

			System.out.println("Your input was " + number);
		}

	}

}
