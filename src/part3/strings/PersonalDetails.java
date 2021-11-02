package part3.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;
		int lengest = 0;
		String name = "";

		while (true) {

			String nameAge = scanner.nextLine();
			if (nameAge.equals("")) {
				break;
			}
			String[] sepNameAge = nameAge.split(",");
			sum = sum + Integer.valueOf(sepNameAge[1]);
			count++;

			int length = sepNameAge[0].length();
			if (length > lengest) {

				lengest = length;

				name = sepNameAge[0];

			}

		}

		double average = 1.0 * sum / count;

		System.out.println("Longest name: " + name);

		System.out.println("Average of the birth years: " + average);

	}
}
