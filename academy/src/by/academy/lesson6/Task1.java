package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	
//	1. ����� � ������ �� ������ �������, �� � ������ ����� ����������. ����������ujyuiu
//	����� �� ����������

	public static void main(String[] args) {
		String text = "2. ������� ������ � �������! ���������� ���������� ���� � ������. ����������\r\n"
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����\r\n"
				+ "������ ����� ����� ���� �������, �� ����� � �������������?";
		String regex = "{\\.,!&}";
		
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		int counter = 0;
		while (m.find()) { 
			counter++;
			System.out.print(text.substring(m.start(), m.end()));		
		}
     	System.out.println();
     	System.out.println(counter);
	}

}
