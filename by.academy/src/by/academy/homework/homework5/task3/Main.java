package by.academy.homework.homework5.task3;

import by.academy.homework.homework4.task3.MatrixIterator;

public class Main {

	public static void main(String[] args) {
		Integer[][] matrix = { { 1, 2, 3 }, {}, { 4, 5 }, { 6 } };
		MatrixIterator<Integer> iterator = new MatrixIterator<>(matrix);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
