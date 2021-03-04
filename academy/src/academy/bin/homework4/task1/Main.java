package academy.bin.homework4.task1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���� � ������� \"dd-MM-yyyy\": ");
		String str = scn.nextLine();

		final Date objDate = new Date(str);

		if (objDate.sDate != null) {

			System.out.println("����: " + objDate.sDate);
			Date.Year objYear = objDate.new Year();
			objYear.LeapYear(objDate.date);

			Date.Month objMonth = objDate.new Month();
			System.out.println("�����: " + objMonth.month + " - " + objDate.date.getMonth());

			Date.Day objDay = objDate.new Day();
			System.out.println("�����: " + objDay.day);
			objDay.DayOfWeek(objDate.date);

//			���������� ���������� ���� � �������� ��������� ����������.
			LocalDate begDate = LocalDate.of(2020, 2, 28);
			LocalDate endDate = LocalDate.of(2021, 2, 28);
			System.out.println("���������� ���� � ����������: " + ChronoUnit.DAYS.between(begDate, endDate));
		}
		scn.close();
	}
}
