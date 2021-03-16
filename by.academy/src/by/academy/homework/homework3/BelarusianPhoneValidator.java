package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusianPhoneValidator implements Validator {  

	private Pattern p = Pattern.compile("\\+375((29)|(33)|(44)|(25))[0-9]{7}");

	@Override
	public boolean isValid(String str) {
		Matcher m = p.matcher(str);
		return m.find();
	}
}