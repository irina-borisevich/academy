package by.academy.homework.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws ParseException {
		Scanner scn = new Scanner(System.in);

		System.out.println("Введите дату в формате \"dd/MM/yyyy\" либо \"dd-MM-yyyy\": ");
		String str = scn.nextLine();

		DateValidator val = new DateValidator();
		if (!val.isValid(str)) {
			System.out.println("Неправильный формат даты!");
		} else {
			SimpleDateFormat df = new SimpleDateFormat("dd" + str.charAt(2) + "MM" + str.charAt(2) + "yyyy");
			Date date = df.parse(str);

			df = new SimpleDateFormat("dd");
			System.out.println("День: " + df.format(date));

			df = new SimpleDateFormat("MMMM");
			System.out.println("Месяц: " + df.format(date));

			df = new SimpleDateFormat("yyyy");
			System.out.println("Год: " + df.format(date));
		}
		scn.close();
	}
}
