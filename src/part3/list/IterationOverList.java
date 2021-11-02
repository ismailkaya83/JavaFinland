package part3.list;

import java.util.ArrayList;

public class IterationOverList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		System.out.println("Number of values on the list: " + list.size());

		list.add("First");
		System.out.println("Number of values on the list: " + list.size());

		System.out.println(list);

		list.add("Second");
		System.out.println("Number of values on the list: " + list.size());

		System.out.println(list);

		System.out.println("***********************************************");

		ArrayList<String> teachers = new ArrayList<>();

		teachers.add("Simon");
		teachers.add("Samuel");
		teachers.add("Ann");
		teachers.add("Anna");

		int index = 0;
		// Repeat for as long as the value of the variable `index`
		// is smaller than the size of the teachers list
		while (index < teachers.size()) {
			System.out.println(teachers.get(index));
			index = index + 1;
		}

		System.out.println("***********************************************");

		ArrayList<String> teachers1 = new ArrayList<>();

		teachers1.add("Simon");
		teachers1.add("Samuel");
		teachers1.add("Ann");
		teachers1.add("Anna");

		for (int i = 0; i < teachers1.size(); i++) {
			System.out.println(teachers1.get(i));
		}
		
		System.out.println("\nPrinting the numbers in the list in reverse order would also be straightforward.");

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		int index1 = numbers.size() - 1;
		while (index1 >= 0) {
		    int number = numbers.get(index1);
		    System.out.println(number);
		    index1 = index1 - 1;
		}
		
		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}

	}

}
