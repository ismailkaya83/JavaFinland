package part3.list;

//import the list to make it available to the program
import java.util.ArrayList;

public class listStart {

	public static void main(String[] args) {

		// create a list
		ArrayList<String> list = new ArrayList<>();

		// the list isn't used yet

		list.add("String is a reference-type variable");

		ArrayList<Integer> integers = new ArrayList<>();
		int integer = 1;
		integers.add(integer);

		ArrayList<Double> doubles = new ArrayList<>();
		double d = 4.2;
		doubles.add(d);

	}

}
