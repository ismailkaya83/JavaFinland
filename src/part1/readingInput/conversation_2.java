package part1.readingInput;

import java.util.Scanner;

public class conversation_2 {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);

        System.out.println("Write the first string:");
        String first = reader.nextLine();
        System.out.println("Write the second string:");
        String second = reader.nextLine();
        System.out.println("Write the third string:");
        String third = reader.nextLine();

        System.out.println("Last string you wrote was " + third + ", which ");
        System.out.println("was preceded by " + second+ ".");
        System.out.println("The first string was" + first + ".");

        System.out.println("All together: " + first + second + third);

	}

}
