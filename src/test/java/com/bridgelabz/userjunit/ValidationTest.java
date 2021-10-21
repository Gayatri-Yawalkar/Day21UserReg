package com.bridgelabz.userjunit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//Uc12
import com.bridgelabz.uservalidation.UserValidationException;
import com.bridgelabz.uservalidation.Validation;
public class ValidationTest {
	@Test
	public void givenFirstName_whenItIsValid_shouldPassTestCase(){
		try {
			String firstName=Validation.validateName("Gayatri");
			assertEquals("Success",firstName);
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Name",e.getMessage());
		}
	}
	@Test
	public void givenLastName_whenItIsValid_shouldPassTestCase(){
		try {
			String lastName=Validation.validateName("Yawalkar");
			assertEquals("Success",lastName);
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Name",e.getMessage());
		}
	}
	@Test
	public void givenEmail_whenItIsValid_shouldPassTestCase(){
		try {
			String email=Validation.validateEmail("gayatri@gmail.com");
			assertEquals("Success",email);
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Email",e.getMessage());
		}
	}
	@Test
	public void givenMobileNumber_whenItIsValid_shouldPassTestCase(){
		try {
			String number=Validation.validateNumber("91 8888489304");
			assertEquals("Success",number);
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Number",e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenItIsValid_shouldPassTestCase(){
		try {
			String pass=Validation.validatePassword("Gayatri@678");
			assertEquals("Success",pass);
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Password",e.getMessage());
		}
	}
	@Test
	public void givenFirstName_whenItIsInValid_shouldThrowException(){
		try {
			Validation.validateName("gayatri");
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Name",e.getMessage());
		}
	}
	@Test
	public void givenLastName_whenItIsInValid_shouldThrowException(){
		try {
			Validation.validateName("yawalkar");
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Name",e.getMessage());
		}
	}
	@Test
	public void givenemail_whenItIsInValid_shouldThrowException(){
		try {
			Validation.validateEmail("gayatri@com");
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Email",e.getMessage());
		}
	}
	@Test
	public void givenMobileNumber_whenItIsInValid_shouldThrowException(){
		try {
			Validation.validateNumber("91 888889304");
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Number",e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenItIsInValid_shouldThrowException(){
		try {
			Validation.validatePassword("gayatri@678");
		} catch(UserValidationException e) {
			assertEquals("Enter Valid Password",e.getMessage());
		}
	}
}