package by.academy.homework.homework4.task1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите дату в формате \"dd-MM-yyyy\": ");
		String str = scn.nextLine();

		final Date objDate = new Date(str);

		if (objDate.sDate != null) {
			System.out.println("Дата: " + objDate.sDate);

			LocalDate date = LocalDate.of(Integer.parseInt(str.substring(6)), Integer.parseInt(str.substring(3, 5)),
					Integer.parseInt(str.substring(0, 2)));

			Date.Year objYear = objDate.new Year();
			objYear.year = date.getYear();
			objYear.LeapYear(date);

			Date.Month objMonth = objDate.new Month();
			objMonth.month = date.getMonthValue();
			System.out.println("Месяц: " + objMonth.month + " - " + date.getMonth());

			Date.Day objDay = objDate.new Day();
			objDay.day = date.getDayOfMonth();
			System.out.println("Число: " + objDay.day);
			objDay.DayOfWeek(date);

//	Рассчитать количество дней в заданном временном промежутке.
			LocalDate begDate = LocalDate.of(2020, 2, 28);
			LocalDate endDate = LocalDate.of(2021, 2, 28);
			System.out.println("Количество дней в промежутке: " + ChronoUnit.DAYS.between(begDate, endDate));
		}
		scn.close();
	}
}
