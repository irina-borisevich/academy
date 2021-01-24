package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
       
		System.out.println("Введите число от 1 до 10:");
        int number = scn.nextInt();
        
        if (number > 10) { 
        	System.out.println("Число больше 10!");
        } else {
        	for (int i = 1; i <= 10; i++) {
        		System.out.println(number + " * " + i + " = " + (number * i));
        	}	
        }   
	}
}
