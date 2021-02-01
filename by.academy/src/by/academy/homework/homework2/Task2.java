package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {

	private static int diffWords(String st) {
		StringBuilder str = new StringBuilder();
		String c;

		for (int i = 0; i < st.length(); i++) {
			c = String.valueOf(st.charAt(i));

			if (str.indexOf(c) == -1) {
				str.append(c);
			}
		}
		return str.length();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Введите количество слов:");
		int n = scn.nextInt();

		String[] words = new String[n];
		String result = "";
		System.out.println("Введите слова через пробел:");

		for (int i = 0; i < n; i++) {
			words[i] = scn.next();

			if (i == 0) {
				result = words[0];
			} else {
				if (diffWords(words[i]) < diffWords(result)) {
					result = words[i];
				}
			}
		}

		System.out.println("Cлово: " + result + ", число разных символов: " + diffWords(result));
		scn.close();
	}
}
