package by.academy.lesson6;

public class Task5 {

//	5. ���� ������:
//		" Hey      There!     How      Are you doing"   ;6t7676
//		�������� ���� 1 ������ ����� ����.

		public static void main(String[] args) {
			String str = " Hey      There!     How      Are you doing";
		
			System.out.println(str.replaceAll("\\s+", " ").trim());
	}

}
