package by.academy.homework.homework5.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Learner> learners = new ArrayList<Learner>();
		for (int i = 0; i < 15; i++) {
			learners.add(new Learner("learner_" + (i + 1), 4 + (int) (Math.random() * (10 - 4) + 1))); // оценки от 5 до
																										// 10
			System.out.println(learners.get(i).getName() + " - " + learners.get(i).getGrade());
		}

		ListIterator<Learner> learnerIter = learners.listIterator();
		int highGrade = 5;
		while (learnerIter.hasNext()) {
			int element = learnerIter.next().grade;

			if (element > highGrade) {
				highGrade = element;
			}
		}
		System.out.println("Cамая высокая оценка - " + highGrade);
	}
}
