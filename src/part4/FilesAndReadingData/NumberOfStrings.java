package part4.FilesAndReadingData;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<>();

		while (true) {
			String line = scanner.nextLine();

			if (line.equals("end")) {
				break;
			}

			wordList.add(line);

		}

		System.out.println(wordList.size());
	}
}
