package by.academy.homework.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Task4 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:/IVB/task4");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File fileSource = new File("C:/IVB/task2.txt");
		File fileDestination = new File(dir, "result.txt");

		writeText(readText(fileSource), dir, fileDestination);
		System.out.println("The list of files is written to the file " + fileDestination.getAbsolutePath());
		System.out.println("The program is over!");

	}

	public static String readText(File source) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {

			String str;
			String strFull = "";
			while ((str = bufferedReader.readLine()) != null) {
				strFull = strFull.concat(str);
			}
			return strFull;
		}
	}

	private static void writeText(String text, File dir, File destination) throws IOException {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {

			int r;
			for (int i = 1; i <= 100; i++) {
				File file = new File(dir, i + ".txt");

				r = i + (int) (Math.random() * (text.length() - i));

				try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(file))) {
					writeFile.write(text.substring(r));
				}

				bufferedWriter.write(file.getName() + " - " + file.length() + " byte.");
			}
		}
	}
}
