package part2.repeatingFunctionality;

import java.util.Scanner;

public class While9_AverageOfNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		while (true) {

			System.out.println("Give a number:");
			int num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			}

			count++;
			sum = sum + num;

		}

		if (count > 0) {
			// Print only if user has given numbers to avoid dividing by zero
			double average = (double) sum / count;
			System.out.println("Average of the numbers: " + average);
		}

	}
}
