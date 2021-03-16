package by.academy.homework.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) {

		File dir = new File("C:/IVB");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File fileSource = new File(dir, "task2.txt");
		File fileDestination = new File(dir, "result.txt");

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileSource));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileDestination))) {

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				bufferedWriter.write(str.replaceAll("\\s", ""));
				bufferedWriter.newLine();
			}

			System.out.println("Text saved in file " + fileDestination.getAbsolutePath());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
