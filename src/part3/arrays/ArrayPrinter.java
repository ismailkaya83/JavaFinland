package part3.arrays;

public class ArrayPrinter {

	public static void main(String[] args) {
		// You can test your method here
		int[] array = { 5, 1, 3, 4, 2 };
		printNeatly(array);
	}

	public static void printNeatly(int[] array) {

		for (int number : array) {

			System.out.print(number);

			if (number != array[array.length - 1]) {

				System.out.print(",");

			}

		}

	}
}
