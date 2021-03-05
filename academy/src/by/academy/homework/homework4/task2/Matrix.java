package by.academy.homework.homework4.task2;

import java.util.Arrays;

public class Matrix<T> {
	private T[] array;
	int length;

	public Matrix(T[] array) {
		this.array = array;
		this.length = array.length;
	}

	public void get(int i) {
		System.out.println("Индекс элемента массива: " + array[i]);
	}

	public void getFirst() {
		System.out.println("Первый элемент: " + array[0]);
	}

	public void getLast() {
		System.out.println("Последний элемент: " + array[array.length - 1]);

		int i = array.length - 1;
		while ((array[i] == null) && (i >= 1)) {
			i--;
		}
		System.out.println("Индекс последнего заполненного элемента: " + i);
	}

	public void add(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = obj;
				break;
			} else {
				if (i == (array.length - 1)) { // нет пустых элементов
					expandArray();
					array[array.length - 1] = obj;
					System.out.println(array.length);
					System.out.println(Arrays.toString(array));
					break;
				}
			}
		}
	}

	private void expandArray() {
		System.out.println(array.length);
		T[] tempArray = Arrays.copyOf(array, array.length + 1);
		array = tempArray;
	}

	public void remove(int i) {
//  удаление элемента по индексу 
		System.out.println("remove(int i) - Working on it!!!");
	}

	public void remove(T obj) {
//	удаление элемента по значению 
		System.out.println("remove(T obj) - Working on it!!!");
	}
}
