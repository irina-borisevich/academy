package by.academy.homework.homework4.task2;


public class Main {

	public static void main(String[] args) {
//		Integer[] intArray = new Integer[16];
		Integer[] intArray = { 1, 2 };
// �������� intArray[4] = 2;

// ��������� ������

		Matrix<Integer> intMatrix = new Matrix<>(intArray);
		intMatrix.get(1);
		intMatrix.getFirst();
		intMatrix.getLast();
		System.out.println("����� �������: " + intMatrix.length);

		Integer a = 10;
		intMatrix.add(a);
		intMatrix.remove(a);
		intMatrix.remove(a);

	}
}
