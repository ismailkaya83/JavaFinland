package part3.list;

//import list so that the program can use it
import java.util.ArrayList;

public class AddAndRetrieve {

	public static void main(String[] args) {
		// create the word list for storing strings
		ArrayList<String> wordList = new ArrayList<>();

		// add two values to the word list
		wordList.add("First");
		wordList.add("Second");

		// retrieve the value from position 0 of the word list, and print it
		System.out.println(wordList.get(0));
		
		System.out.println(wordList.get(1));
	}

}
