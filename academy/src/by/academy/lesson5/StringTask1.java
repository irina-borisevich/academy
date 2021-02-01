package by.academy.lesson5;

import java.util.Scanner;

public class StringTask1 {
//	1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		String[] arr = new String[n];
		scn.nextLine();
		
		for (int i = 0; i < n; i++ ) {
			arr[i] = scn.nextLine();
		}
		int min = arr[0].length();
		int max = arr[0].length();
		String maxString = arr[0];
		String minString = arr[0];
		
		for (int i = 1; i < n; i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();
				minString = arr[i];
			} else if (arr[i].length() > max) {
				max = arr[i].length();
				maxString = arr[i];
			}
		}
	
		System.out.println("Min: " + min);
		System.out.println("Min string: " + minString);
		System.out.println("Max: " + max);
	    System.out.println("Max string: " + maxString);
		scn.close();
	}

}
