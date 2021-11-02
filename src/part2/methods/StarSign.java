package part2.methods;

public class StarSign {

	public static void main(String[] args) {

		printTriangle(4);

	}

	public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void printSpaces(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" ");
		}
	}

	public static void printTriangle(int size) {
		int i = 0;
		int star = 1;
		int space = size - 1;
		while (i < size) {
			printSpaces(space);
			printStars(star);
			star = star + 2;
			space--;
			i++;
		}
		for (int a = 1; a < 3; a++) {
			printSpaces(size - 2);
			printStars(3);
		}

	}

}