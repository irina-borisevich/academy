package by.academy.lesson6;

import java.util.regex.Pattern;

public class Task6 {
 // 6. �������� regexp ��� email.56756757
	
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
