package academy.bin.homework4.task2;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[16];
			
//		intArray[4] = 2;

		Matrix<Integer> intMatrix = new Matrix<>(intArray);
		intMatrix.get(2);
		intMatrix.getFirst();
		intMatrix.getLast();
		System.out.println(intMatrix.length);

	}
}