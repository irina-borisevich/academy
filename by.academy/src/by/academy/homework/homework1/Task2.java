package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {		
		 Scanner scn = new Scanner(System.in);
	     
		System.out.println("������� ��� � �������� ����������: ");
        String type = scn.nextLine();
		
        switch (type) {
        case "int": 
       	 System.out.println("���������: " + scn.nextInt() % 2); 
            break;
        case "double": 
       	 System.out.println("���������: " + scn.nextDouble() * 0.7); 
       	 break;
        case "float": 
       	 System.out.println("���������: " + Math.pow(scn.nextFloat(), 2)); 
       	 break;
        case "char": 
       	 System.out.println("���������: " + (int) scn.nextLine().charAt(0));
        	 break;
        case "String": 
       	 System.out.println("Hello " + scn.nextLine());  
       	 break;
        default: System.out.println("Unsupported type");         
        }
	}
}
