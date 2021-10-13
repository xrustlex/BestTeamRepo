

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import automationPractice.PageObjects.AutheticationPage_Z;

public class PasswordResetTest extends framework.autoTestbase{
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