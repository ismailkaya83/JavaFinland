package part2.repeatingFunctionality;

import java.util.Scanner;

public class for5 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.print("Write numbers, negative numbers are invalid: ");
		int sum = 0;
		int validNumbers = 0;
		int invalidNumbers = 0;

		while (true) {
		    int input = Integer.valueOf(reader.nextLine());

		    if (input == 0) {
		        break;
		    }

		    if (input < 0) {
		        invalidNumbers++;
		        continue;
		    }

		    sum += input;
		    validNumbers++;
		}

		// bu ornekte ogretilmek istenen sey, buradaki printlerin dongu icerisinde degil de dongu disinda yazilmasinin daha dogru oldugu
		
		System.out.println("Sum of valid numbers: " + sum);
		System.out.println("Valid numbers: " + validNumbers);
		System.out.println("Invalid numbers: " + invalidNumbers);

	}

}
