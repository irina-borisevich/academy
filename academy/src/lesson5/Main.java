package lesson5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("������� ������ ����� :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " ������ " + num2);
		} else if  (num2 > num1) {
			System.out.println(num2 + " ������ " + num1);
		} else {
			System.out.println("����� ����� ");
		}
// ����� ������� ��������������
	}

}
