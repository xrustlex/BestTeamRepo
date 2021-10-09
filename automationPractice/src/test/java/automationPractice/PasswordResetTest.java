package automationPractice;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import automationPractice.PageObjects.AutheticationPage_Z;
import automationPractice.framework.autoTestbase;

public class PasswordResetTest extends autoTestbase{
       static  String baseUrl ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public PasswordResetTest() {
		super(baseUrl);
		}

	@Test
	public void validateResetPassword() {
		String message = new AutheticationPage_Z(driver,baseUrl)
		.clickForgotPasswordLink()
		.clickRetrievePassword()
		.getMessage();
		System.out.println("Text:" + message);
		assertEquals("Text is not as expected.", "A confirmation email has been sent to your address: abcxxx@gmail.com" , message);
	
	}
}