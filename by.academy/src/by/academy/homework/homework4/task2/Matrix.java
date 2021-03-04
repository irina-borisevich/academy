package by.academy.homework.homework4.task2;

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
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == null) {
//			 array[i] = T obj;	
				break;
			}
			i++;
		}

//  !!!!!! Если конец массива, Arrays.copyOf()		
		System.out.println("Working on it!!!");

	}

	public void remove(int i) {
//  удаление элемента по индексу 
		System.out.println("Working on it!!!");
	}

	public void remove(T obj) {
//	удаление элемента по значению 
		System.out.println("Working on it!!!");
	}
}
