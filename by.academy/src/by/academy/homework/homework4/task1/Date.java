package by.academy.homework.homework4.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date {
	protected String sDate;

	public Date() {
		super();
	}

	public Date(String sDate) {
		if (!new DateValidator().isValid(sDate)) {
			System.out.println("Invalid date format!");
		} else {
			this.sDate = sDate;
		}
	}

	public class Year {
		protected int year;

		public void LeapYear(LocalDate date) {
			System.out.println("Год " + year + " високосный? " + date.isLeapYear());
		}
	}

	public class Month {
		protected int month;
	}

	public class Day {
		protected int day;

		public void DayOfWeek(LocalDate date) {
			DayOfWeek day = date.getDayOfWeek();
			Week[] values = Week.values();
			System.out.println("День недели: " + (day.ordinal() + 1) + " - " + day + "("
					+ values[day.ordinal()].getRusName() + ")");
		}
	}
}
