package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Введите через пробел 2 слова, состоящие из четного числа букв:");
		String str1 = scn.next();
		String str2 = scn.next();

		if ((str1.length() % 2 == 1) || (str2.length() % 2 == 1)) {
			System.out.println("Введено нечетное количество букв!");
		} else {
			System.out.println(str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2, str2.length()));
		}
		scn.close();
	}
}
