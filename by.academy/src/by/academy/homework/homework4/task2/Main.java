package by.academy.homework.homework4.task2;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[16];
		
// проверка intArray[4] = 2;

// заполнить массив

		Matrix<Integer> intMatrix = new Matrix<>(intArray);
		intMatrix.get(2);
		intMatrix.getFirst();
		intMatrix.getLast();
		System.out.println("Длина массива: " + intMatrix.length);
	}
}
