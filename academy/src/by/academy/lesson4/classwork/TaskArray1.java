package by.academy.lesson4.classwork;

import java.util.Random;

public class TaskArray1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10);
			System.out.println(arr[i] + " ");
		}
		
		for (int i= 0; i < arr.length; i++) {
			int temp;
			for (int n = 0; n < arr.length; n++) {
				if ( arr[i] > arr[n]) {
					temp = arr [i];
					arr[i] = arr[n];
					arr[n] = temp;
				}
			}						
		}
	}

}
