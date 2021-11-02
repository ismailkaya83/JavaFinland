package part4.ObjectsInAList;

public class Book {

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

	private String title;
	private int page;
	private int year;

	public Book(String title, int page, int year) {
		this.title = title;
		this.page = page;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public int getPage() {
		return page;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return this.title + ", " + this.page + " pages, " + this.year;
	}
}