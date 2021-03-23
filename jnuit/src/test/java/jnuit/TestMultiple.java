package jnuit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestMultiple extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestMultiple(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:MultipleOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 5, 1, 5 }, { 7, 8, 56 }, { 9, 9, 81 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getMultiple(valueA, valueB));
	}

}
