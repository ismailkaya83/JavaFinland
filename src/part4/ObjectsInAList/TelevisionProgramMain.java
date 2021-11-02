package part4.ObjectsInAList;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramMain {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class

		ArrayList<TelevisionProgram> programs = new ArrayList<>(); 
		// TelevisonProgram isimli bir Class ve ona class icinde programs isimli bir array list
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Name: ");
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}

			System.out.println("Duration: ");
			int time = Integer.valueOf(scanner.nextLine());

			programs.add(new TelevisionProgram(name, time));
			// "programs" listesine .add metodunu kullanarak TelevisonProgram sinifindan object ekliyoruz
		}

		System.out.print("Program's maximum duration? ");
		int max = Integer.valueOf(scanner.nextLine());

		for (TelevisionProgram program : programs) {
			if (program.getDuration() <= max) {
				System.out.println(program);
			}
		}

	}
}
