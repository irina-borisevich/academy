package by.academy.lesson3.cat;

public class Cat {
	int age;
	String nickname;
	
	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}
	
	public void grow() {
		age++;
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
}
