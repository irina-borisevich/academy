package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private Pattern p = Pattern.compile("[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}");

	@Override
	public boolean isValid(String str) {
		Matcher m = p.matcher(str);
		return m.find();
	}
}
