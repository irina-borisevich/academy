package by.academy.homework.homework4.task2;

import java.util.Arrays;

public class Matrix<T> { 
	
	private T[] array;
	int length;

	public Matrix(T[] array) {
		this.array = array;
		this.length = array.length;
	}

	public T[] getArray() {
		return array;
	}

	public void get(int i) {
		System.out.println("Элемент массива c индексом " + i + ": " + array[i]);
	}

	public void getFirst() {
		System.out.println("Первый элемент: " + array[0]);
	}

	public void getLast() {
		System.out.println("Последний элемент: " + array[array.length - 1]);
	}

	public void lastNotEmpty() {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				System.out.println("Индекс последнего заполненного элемента: " + i);
				return;
			}

			if (i == 0) {
				System.out.println("Нет заполненных элементов!");
			}
		}
	}

	public void add(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = obj;
				return;
			}

			if (i == (array.length - 1)) { // нет пустых элементов
				expandArray();
			}
		}
	}

	private void expandArray() {
		T[] tempArray = Arrays.copyOf(array, array.length + 1);
		array = tempArray;
	}

	public void remove(int i) {
		if (i >= array.length || i < 0) {
			System.out.println("Index of bound");
			return;
		}

		if (i != (array.length - 1)) {
			System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
		}

		array[array.length - 1] = null;
	}

	public void removeObj(T obj) {
		for (int i = 0; i < array.length - 1; i++) {

			if ((array[i] != null) && (array[i].equals(obj))) {
				if (i != (array.length - 1)) {
					System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
				}
				array[array.length - 1] = null;
			}
		}
	}
}
