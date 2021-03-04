package academy.bin.homework4.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date { 
	protected String sDate;
	protected LocalDate date;

	public Date() {
		super();
	}

	public Date(String sDate) {
		if (!new DateValidator().isValid(sDate)) {
			System.out.println("Invalid date format!");
		} else {
			this.sDate = sDate;
			createDate();
		}
	}

	public class Year {
		protected int year = date.getYear();

		public void LeapYear(LocalDate date) {
			System.out.println("Год " + year + " високосный? " + date.isLeapYear());
		}
	}

	public class Month {
		protected int month;

		public Month() {
			super();
			this.month = date.getMonthValue();
		}
	}

	public class Day {
		protected int day;

		public Day() {
			super();
			this.day = date.getDayOfMonth();
		}

		public void DayOfWeek(LocalDate date) {
			DayOfWeek day = date.getDayOfWeek();
			Week[] values = Week.values();
			System.out.println("День недели: " + (day.ordinal() + 1) + " - " + day + "("
					+ values[day.ordinal()].getRusName() + ")");
		}
	}

	public void createDate() {
		date = LocalDate.of(Integer.parseInt(sDate.substring(6)), Integer.parseInt(sDate.substring(3, 5)),
				Integer.parseInt(sDate.substring(0, 2)));
	}
}
