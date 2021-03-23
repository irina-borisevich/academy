package junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestSum extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestSum(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index} : sumOf({0} + {1} = {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 4, 1, 5 }, { 10, 6, 16 }, { 18, 12, 30 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}
}
