package lesson5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Задайте первое число :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " больше " + num2);
		} else if  (num2 > num1) {
			System.out.println(num2 + " больше " + num1);
		} else {
			System.out.println("Числа равны ");
		}
// найти среднее арифметическое
	}

}
