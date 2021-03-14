package by.academy.homework.homework4.task2;

import java.util.Arrays;

public class Main { 

	public static void main(String[] args) {
		Integer[] intArray = new Integer[16];

		for (int i = 0; i < intArray.length; i++) {
			if (i != 7) {
				intArray[i] = intArray.length - i;
			}
		}

		System.out.println(Arrays.toString(intArray));

		Matrix<Integer> intMatrix = new Matrix<>(intArray);

		intMatrix.get(5);
		intMatrix.getFirst();
		intMatrix.getLast();
		System.out.println("����� �������: " + intMatrix.length);
		intMatrix.lastNotEmpty();

		intMatrix.add(4);
		intMatrix.add(30);
		System.out.println("���������� ��������� � ������:");
		System.out.println(Arrays.toString(intMatrix.getArray()));

		System.out.println("�������� ��������� �� �������:");
		intMatrix.remove(20);
		intMatrix.remove(4);
		System.out.println(Arrays.toString(intMatrix.getArray()));
		
		System.out.println("�������� ��������� �� ��������:");
		intMatrix.removeObj(4);
		System.out.println(Arrays.toString(intMatrix.getArray()));
	}
}
