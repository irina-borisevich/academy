package by.academy.homework.homework4.task3;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Integer[][] matrix = { { 1, 10, 5 }, {}, { 8, 2 }, { 7 } };

		Iterator<Integer> iterator = new MatrixIterator<>(matrix);

		while (iterator.hasNext()) { 
			System.out.println(iterator.next());
		}
	}
}
