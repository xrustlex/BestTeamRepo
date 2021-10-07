package automationPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SimpleRegistrationTest extends automationPracticeTestBase {


	@Test
	public void registerForAutomationPractice(){
		
		CreateAccountPage page = 
				new HomePageAutomation(this.driver, this.baseUrl)
				.ClickSignIn()
				.ClickCreateAnAccount();
				//.ClickOnRegisterButton();
		
	}

}
