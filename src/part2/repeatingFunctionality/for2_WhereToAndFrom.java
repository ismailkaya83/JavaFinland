package part2.repeatingFunctionality;

import java.util.Scanner;

public class for2_WhereToAndFrom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Where to?"); 
		int num1 = Integer.valueOf(scanner.nextLine());

		for (int i = 1; i <= num1; i++) {
			System.out.println(i);
		}

		System.out.println("Where to?");
		int num2 = Integer.valueOf(scanner.nextLine());

		System.out.println("Where from?");
		int num3 = Integer.valueOf(scanner.nextLine());

		for (int i = num3; i <= num2; i++) {
			System.out.println(i);
		}

	}

}
