package junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestSubstract extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestSubstract(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index} : sumOf({0} - {1}) = {2}")
	public static Iterable<Object[] > dataForTest() {
		return Arrays.asList(new Object[][] { { 4, 1, 3 }, { 10, 6, 4 }, { 18, 12, 6 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSubtract(valueA, valueB));
	}
}
