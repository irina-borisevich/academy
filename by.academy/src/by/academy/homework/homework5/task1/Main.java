package by.academy.homework.homework5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<>();
		array.add("Минск");
		array.add("Гомель");
		array.add("Брест");
		array.add("Могилев");
		array.add("Витебск");
		array.add("Гродно");
		array.add("Гомель");
		array.add("Витебск");
		System.out.println(Arrays.toString(array.toArray()));

		Collection<String> newArray = removeDuplicates(array);
		System.out.println(Arrays.toString(newArray.toArray()));
	}

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}
}
