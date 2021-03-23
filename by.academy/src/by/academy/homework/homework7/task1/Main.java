package by.academy.homework.homework7.task1;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Long> longList = generateLongList(100, 100);
		System.out.print(longList);

		Map<Double, Object> map = longList.stream().map(num -> Math.abs(num * Math.PI) - 20).filter(num -> num < 100)
				.sorted().skip(3).distinct()
				.collect(Collectors.toMap(num -> num, num -> String.format("Number: " + num)));

		System.out.println();
		System.out.println(map);
	}

	private static List<Long> generateLongList(Integer seed, Integer size) {
		return Stream.generate(() -> Long.valueOf(new Random().nextInt(seed))).limit(size).collect(Collectors.toList());
	}

}
