package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USAPhoneValidator implements Validator { 
	
	private Pattern p = Pattern.compile("\\+1[2-9]{3}[0-9]{7}");

	@Override
	public boolean isValid(String str) {
		Matcher m = p.matcher(str);
		return m.find();
	}
}
