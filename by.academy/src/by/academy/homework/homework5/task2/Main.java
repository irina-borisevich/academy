package by.academy.homework.homework5.task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		final int N = 1000000;
		final int M = 100000;

		for (int i = 0; i < N; i++) {
			arrayList.add(i + (int) Math.random() * (N - i));
			linkedList.add(i + (int) Math.random() * (N - 1));
		}

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get(i + (int) (Math.random() * (M - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get(i + (int) (Math.random() * (M - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		System.out.println("ArrayList работает гораздо быстрее.");
		System.out.println("В ArrayList, как в массиве, можно получить доступ к любому элементу с помощью индекса.");
		System.out.println(
				"В LinkedList, как в связанном списке, нужно перемещаться по всему списку, начиная с first , пока не получим нужный элемент.");
	}
}
