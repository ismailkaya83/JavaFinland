package part4.ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		// Write a program that first reads book information from the user. The details
		// to be asked for each book include the title, the number of pages and the
		// publication year. Entering an empty string as the name of the book ends the
		// reading process.

		// After this the user is asked for what is to be printed. If the user inputs
		// "everything", all the details are printed: the book titles, the numbers of
		// pages and the publication years. However, if the user enters the string
		// "name", only the book titles are printed.

		// It is probably worthwhile to implement a class called Book to represent a
		// book. There are two points in total available for this exercise.

		ArrayList<Book> books = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Title: ");
			String title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}

			System.out.println("Pages: ");
			int page = Integer.valueOf(scanner.nextLine());

			System.out.println("Publication year: ");
			int year = Integer.valueOf(scanner.nextLine());

			books.add(new Book(title, page, year));
		}

		System.out.println("What information will be printed? ");
		String information = scanner.nextLine();

		for (Book book : books) {

			if (information.equals("everything")) {
				System.out.println(book);
			} else if (information.equals("name")) {
				System.out.println(book.getTitle());
			}

		}

	}
}
