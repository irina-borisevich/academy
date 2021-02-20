package by.academy.homework.homework3;

import java.util.Scanner;

public class Person {
	String name;
	String dateOfBirth;
	String phone;
	String email;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void enterPerson() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Name - ");
		name = scn.nextLine();

		System.out.print("Date of Birthday (format \"dd/MM/yyyy\"; \"dd-MM-yyyy\") - ");
		for (;;) {
			dateOfBirth = scn.nextLine();
			Validator val = new DateValidator();
			if (!val.isValid(dateOfBirth)) {
				System.out.println("Invalid date format! Enter again");
		} else {
				break;
			}
		}

		System.out.print("Phone (+375xxxxxxxxx): ");
		for (;;) {
			phone = scn.nextLine();
			Validator val = new BelarusianPhoneValidator();
			if (!val.isValid(phone)) {
				System.out.println("Invalid phone format! Enter again.");
			} else {
				break;
			}
		}

		System.out.print("E-mail: ");
		for (;;) {
			email = scn.nextLine();
			Validator val = new EmailValidator();
			if (!val.isValid(phone)) {
				System.out.println("This email does not exist! Enter again.");
			} else {
			break;
			}
		}
	}
}
