package by.academy.homework.homework2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {

		int cards = 5;
		int n = 52;
		int players = 0;
		String[] suits = { "Пик", "Бубен", "Червей", "Треф" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };

		for (;;) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Введите количество игроков: ");

			if (scn.hasNextInt()) {

				players = scn.nextInt();
				if ((players > 0) && (players <= 10)) {
					break;
				} else {
					System.out.println("Неправильно введено число игроков!");
				}
			} else {
				System.out.println("Вы ввели не число, или Ваше число слишком большое!");
			}
		}

//   Создание колоды
		String[] deck = new String[n];
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = rank[i] + " " + suits[j];
			}
		}
		
//   Перетасовка колоды
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		
//   Раздача карт
		for (int i = 0; i < players * cards; i++) {
			System.out.println(deck[i]);
			
			if (i % cards == cards - 1) {
		       System.out.println();
			}
		}
	}
}