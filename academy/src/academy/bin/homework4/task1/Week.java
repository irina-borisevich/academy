package academy.bin.homework4.task1;

public enum Week {
	MONDAY("�����������"), TUESDAY("�������"), WEDNESDAY("�����"), THURSDAY("�������"), FRIDAY("�������"),
	SATURDAY("�������"), SUNDAY("�����������"),;

	private String rusName;

	Week(String rusName) {
		this.rusName = rusName;
	}

	public String getRusName() {
		return rusName;
	}
}
