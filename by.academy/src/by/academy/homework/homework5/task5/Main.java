package by.academy.homework.homework5.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите текст:");
		String text = scn.nextLine();

		Map<Character, Integer> map = new HashMap<>();

		char ch;
		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort(Entry.comparingByKey());   

		for (Map.Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		scn.close();
	}
}
