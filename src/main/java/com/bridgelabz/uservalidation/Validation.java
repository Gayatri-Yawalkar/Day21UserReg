package com.bridgelabz.uservalidation;
import java.util.regex.Pattern;
//Uc12
public class Validation {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static final String NUMBER_REGEX="91\s{1}[7-9]{1}[0-9]{9}";
	public static final String EMAIL_REGEX="[A-Za-z]+(\\.[A-Za-z]+)?@[a-zA-Z]+\\.co(m)?(\\.in)?";
	public static final String PASSWORD="(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
	public static String validateName(String name) throws UserValidationException {
		if(Pattern.matches(NAME_REGEX, name)) {
			return "Success";
		} else {
			throw new UserValidationException("Enter Valid Name");
		}
	}
	public static String validateNumber(String number) throws UserValidationException {
		if(Pattern.matches(NUMBER_REGEX, number)) {
			return "Success";
		} else {
			throw new UserValidationException("Enter Valid Number");
		}	
	}
	public static String validateEmail(String email) throws UserValidationException {
		if(Pattern.matches(EMAIL_REGEX, email)) {
			return "Success";
		} else {
			throw new UserValidationException("Enter Valid Email");
		}
	}
	public static String validatePassword(String pass) throws UserValidationException {
		if(Pattern.matches(PASSWORD, pass)) {
			return "Success";
		} else {
			throw new UserValidationException("Enter Valid Password");
		}
	}
}