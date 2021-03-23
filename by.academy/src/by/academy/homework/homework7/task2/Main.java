package by.academy.homework.homework7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		User myUser = new User();
		myUser.setFirstName("Elka");
		myUser.setLastName("dog");
		myUser.setAge(5);
		myUser.setDateOfBirth("04.07.2015");
		myUser.setLogin("myLogin");
		myUser.setPassword("myPassword");
		myUser.setEmail("elka.ru");

		System.out.println(myUser.printUserInfo());

		Class<User> myClass = User.class;

		System.out.println();
		try {
			Method userMetod = myClass.getMethod("getEmail");
			System.out.println(userMetod);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println();
		Method[] userMethods = myClass.getMethods();
		for (Method method : userMethods) {
			System.out.println(method);
		}

		System.out.println();
		try {
			Field userFieldEmail = myClass.getField("email");
			System.out.println(userFieldEmail);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println();
		Field[] userFields = myClass.getFields();
		for (Field field : userFields) {
			System.out.println(field);
		}

		System.out.println();
		try {
			Method userDeclareMethod = myClass.getDeclaredMethod("getEmail");
			System.out.println(userDeclareMethod);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println();
		Method[] userDeclaredMethods = myClass.getDeclaredMethods();
		for (Method method : userDeclaredMethods) {
			System.out.println(method);
		}

		System.out.println();
		try {
			Field emailField = myClass.getDeclaredField("email");
			System.out.println(emailField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println();
		Field[] userDeclaredFields = myClass.getDeclaredFields();
		for (Field field : userDeclaredFields) {
			System.out.println(field);
		}

		try {
			System.out.println();
			Field loginField = myClass.getField("login");
			System.out.println("Before change: " + loginField.get(myUser));
			loginField.set(myUser, "newLogin");
			System.out.println("After change: " + loginField.get(myUser));

			System.out.println();
			Field emailField = myClass.getField("email");
			System.out.println("Before change: " + emailField.get(myUser));
			emailField.set(myUser, "newEmail");
			System.out.println("After change: " + emailField.get(myUser));

			System.out.println();
			Field passwordField = myClass.getDeclaredField("password");
			passwordField.setAccessible(true);
			System.out.println("Before change: " + passwordField.get(myUser));
			passwordField.set(myUser, "newPassword");
			System.out.println("After change: " + passwordField.get(myUser));

			System.out.println();
			Field firstNameField = myClass.getField("firstName");
			System.out.println("Before change: " + firstNameField.get(myUser));
			firstNameField.set(myUser, "newFirstName");
			System.out.println("After change: " + firstNameField.get(myUser));

			System.out.println();
			Field lastNameField = myClass.getField("lastName");
			System.out.println("Before change: " + lastNameField.get(myUser));
			lastNameField.set(myUser, "newLastName");
			System.out.println("After change: " + lastNameField.get(myUser));

			System.out.println();
			Field ageField = myClass.getField("age");
			System.out.println("Before change: " + ageField.get(myUser));
			ageField.set(myUser, 6);
			System.out.println("After change: " + ageField.get(myUser));

			System.out.println();
			Field dateOfBirthField = myClass.getField("dateOfBirth");
			System.out.println("Before change: " + dateOfBirthField.get(myUser));
			dateOfBirthField.set(myUser, "newDateOfBirth");
			System.out.println("After change: " + dateOfBirthField.get(myUser));

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Method userPrintUserInfo = myClass.getDeclaredMethod("printUserInfo");
			System.out.println();
			System.out.println(userPrintUserInfo.invoke(myUser));
		} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| SecurityException e) {
			System.out.println(e.getMessage());
		}
	}
}
