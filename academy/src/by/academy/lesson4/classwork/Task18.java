package by.academy.lesson4.classwork;

public class Task18 {
//	������ ����������� ����� N. ����� ���������� ����������� �����, �� ������������� N � �� ��������� �� �� ���� �� ����� 2,3,5.
	
	public static void main(String[] args) {
		int number = 56;
		int counter = 0; 
		for (int i = 1; i <= number; i++) {
			boolean t = i % 2 != 0 & i % 3 != 0 & i % 5 != 0;
			
			if (t) {
				System.out.println(i + ", ");
				counter++;
			}
		}
		
		System.out.println("counter: " + counter);
	}
}
