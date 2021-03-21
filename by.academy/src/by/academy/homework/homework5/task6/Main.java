package by.academy.homework.homework5.task6;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		int[] array = new int[8];
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите элементы массива через пробел:");

		try {
			for (int i = 0; i <= array.length; i++) {
				array[i] = scn.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array!");
		}
		scn.close();
	}
}
