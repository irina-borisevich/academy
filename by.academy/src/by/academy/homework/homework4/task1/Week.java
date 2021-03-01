package by.academy.homework.homework4.task1;

public enum Week {
	MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
	SATURDAY("Суббота"), SUNDAY("Воскресенье"),;

	private String rusName;

	Week(String rusName) {
		this.rusName = rusName;
	}

	public String getRusName() {
		return rusName;
	}
}
