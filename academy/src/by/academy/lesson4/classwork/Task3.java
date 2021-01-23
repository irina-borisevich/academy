package by.academy.lesson4.classwork;

import java.util.Scanner;

public class Task3 {
// 3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Введите максимальное число: ");
		int max_n = scn.nextInt();
		int it_comp = 1;
		
		for (int i = 1; i <= max_n; i++) {
			it_comp = it_comp * i;
		}
		
		
		System.out.println(it_comp);

		
	}

}
