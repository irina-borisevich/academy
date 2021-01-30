package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	
//	1. Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать
//	общее их количество

	public static void main(String[] args) {
		String text = "2. »меетс€ строка с текстом! ѕодсчитать количество слов в тексте. ∆елательно\r\n"
				+ "учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце\r\n"
				+ "текста также могут быть пробелы, но могут и отсутствовать?";
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
