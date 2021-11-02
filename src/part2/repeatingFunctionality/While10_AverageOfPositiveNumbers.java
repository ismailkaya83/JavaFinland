package part2.repeatingFunctionality;

import java.util.Scanner;

public class While10_AverageOfPositiveNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int countOfPositiv = 0;
		int sumOfPositiv = 0;

		while (true) {
			int num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			}

			if (num > 0) {
				countOfPositiv++;
				sumOfPositiv = num + sumOfPositiv;

			}

		}
		if (countOfPositiv == 0) {
			System.out.println("Cannot calculate the average");
		} else {
			System.out.println((double) sumOfPositiv / countOfPositiv);
		}

	}

}
