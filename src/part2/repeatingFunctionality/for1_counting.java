package part2.repeatingFunctionality;

import java.util.Scanner;

public class for1_counting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.valueOf(scanner.nextLine());
		
		for (int i = 0; i<=num; i++) {
			System.out.println(i);
		}

	}

}
