package by.academy.homework.homework7.task2;

public class User extends Person {

	public String login;
	private String password;
	public String email;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String printUserInfo() {
		return "User {firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + ", dateOfBirth = "
				+ dateOfBirth + ", login = " + login + ", password = " + password + ", email = " + email + "}";
	}
}
