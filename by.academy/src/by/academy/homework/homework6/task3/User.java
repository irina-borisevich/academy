package by.academy.homework.homework6.task3;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	public String name;
	public String surname;
	public int age;

	public User(String name, String surname, int age) { 
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
}
