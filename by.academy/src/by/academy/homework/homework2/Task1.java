package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Boolean answer = Boolean.FALSE;

		System.out.println("Введите две строки:");
		String str1 = scn.nextLine();
		String str2 = scn.nextLine();

		if (str1.length() == str2.length()) {
			int[] symbol = new int[256];
			char[] arr1 = str1.toCharArray();

			for (int element : arr1) {
				symbol[element]++;
			}

			for (int i = 0; i < str2.length(); i++) {
				int element = str2.charAt(i);
				symbol[element]--;

				if (symbol[element] < 0) {
					answer = Boolean.FALSE;
					break;
				}
				answer = Boolean.TRUE;
			}
		}

		System.out.println("Ответ: " + answer);
		scn.close();
	}
}
