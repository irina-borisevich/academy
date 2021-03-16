package by.academy.homework.homework6.task3;

import java.io.File;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<User>();

		users.add(new User("Максим", "Величко", 20));
		users.add(new User("Илья", "Гастило", 21));
		users.add(new User("Владислав", "Жерносек", 22));
		users.add(new User("Андрей", "Исаков", 23));
		users.add(new User("Артём", "Кухарев", 24));
		users.add(new User("Максим", "Лютаревич", 25));
		users.add(new User("Игорь", "Максименко", 26));
		users.add(new User("Денис", "Матусевич", 27));
		users.add(new User("Сергей", "Пантелеев", 28));
		users.add(new User("Евгений", "Пашко", 29));

		File dir = new File("C:/IVB/users");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (int i = 0; i < users.size(); i++) {

			File file = new File(dir, users.get(i).name + "_" + users.get(i).surname + ".txt");

			try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
					ObjectOutputStream outsUser = new ObjectOutputStream(bufferedOutputStream)) {
				outsUser.writeObject(users);

			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		System.out.println("The program is over!");
	}

}
