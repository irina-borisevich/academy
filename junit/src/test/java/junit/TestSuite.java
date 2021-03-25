package junit;

	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;

	import junit.TestMathPow;
	import junit.TestMathSqrt;

	@RunWith(Suite.class)

	@Suite.SuiteClasses({ TestMathPow.class, TestMathSqrt.class })
	public class TestSuite {
	}