package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double it_cost;
				
		System.out.println("������� ����� ������� � ��������, ���.: ");
		double cost = scn.nextDouble();
				
		if (cost < 100) {
			it_cost = cost * 0.95;   // ������ 5%
				
		} else if  (cost >= 100 & cost < 200) {			
			it_cost = cost * 0.93;  // ������ 7%
				
				
		} else if  (cost >= 200 & cost < 300) {
			System.out.println("������� ������� ����������: ");
			int age = scn.nextInt();
					
			if (age > 18) {
				it_cost = cost * 0.84;   // ������ 12% + 4% = 16%
			} else it_cost = cost * 0.91;   // ������ 12% - 3% = 9%
				
				
			} else if  (cost >= 300 & cost < 400) {
			it_cost = cost * 0.85;   // ������ 15%
					
			} else it_cost = cost * 0.8;   // ������ 20%	
				
			System.out.println("��������� ������� �� �������: " + it_cost + " ���.");
	}

}
