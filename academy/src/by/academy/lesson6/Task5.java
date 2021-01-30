package by.academy.lesson6;

public class Task5 {

//	5. ƒана строка:
//		" Hey      There!     How      Are you doing"   ;
//		оставить лишь 1 пробел между слов.

		public static void main(String[] args) {
			String str = " Hey      There!     How      Are you doing";
		
			System.out.println(str.replaceAll("\\s+", " ").trim());
	}

}
