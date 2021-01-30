package by.academy.lesson6;

import java.util.regex.Pattern;

public class Task6 {
 // 6. Написать regexp для email.
	
	static Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");
	
	public static void main(String[] args) {
		String s = "   ";
		System.out.println(validate (s));
	}
	
	private static boolean validate(String s) {
		s = s.trim();
		return p.matcher(s).matches();
	}

}
