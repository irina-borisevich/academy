package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
	Pattern p = Pattern.compile("(0[1-9]|[1-2][0-9]|3[01])[/-](0[1-9]|1[012])[/-]\\d{4}");

	@Override
	public boolean isValid(String str) {
		Matcher m = p.matcher(str);
		return m.find();
	}
}