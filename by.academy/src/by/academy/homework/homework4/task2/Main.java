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
		System.out.println("Длина массива: " + intMatrix.length);
		intMatrix.lastNotEmpty();

		intMatrix.add(4);
		intMatrix.add(30);
		System.out.println("Добавление элементов в массив:");
		System.out.println(Arrays.toString(intMatrix.getArray()));

		System.out.println("Добавление элементов в массив:");
		intMatrix.remove(20);
		intMatrix.remove(4);
		System.out.println(Arrays.toString(intMatrix.getArray()));
		
		System.out.println("Удаление элементов по индексу:");
		intMatrix.removeObj(4);
		System.out.println(Arrays.toString(intMatrix.getArray()));
	}
}
