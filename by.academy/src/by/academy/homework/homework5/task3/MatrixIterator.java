package by.academy.homework.homework5.task3;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {
	private int size; // всего элементов в матрице
	private int position = 0;
	private int row = 0;
	private int col = 0;
	private T[][] matrix;

	public MatrixIterator(T[][] matrix) {
		this.matrix = matrix;
		this.size = countElements(matrix);
	}

	private int countElements(T[][] matrix) {
		int count = 0;
		for (T[] row : matrix) {
			count += row.length;
		}
		return count;
	}

	@Override
	public boolean hasNext() {
		return position < size;
	}

	@Override
	public T next() {
		if (position >= size) {
			return null;
		}
		T element = matrix[row][col];
		position++;
		col++;

		while ((row < matrix.length) && (col >= matrix[row].length)) { // пропустить возможные пустые строки
			System.out.println(col);
			col = 0;
			row++;
		}
		return element;
	}
}
