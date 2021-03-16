package by.academy.homework.homework6;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) { 
		String end = "stop";
		Scanner scn = new Scanner(System.in);

		File dir = new File("C:/IVB");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dir, "task1.txt");

		System.out.println("Enter information (end - string \"stop\"):");

		String str = scn.nextLine();
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
			while (!str.equals(end)) {
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				str = scn.nextLine();
			}
			System.out.println("Information written to file " + file.getAbsolutePath() + "!");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		scn.close();
	}
}
