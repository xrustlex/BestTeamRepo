package automationPractice;

import org.testng.annotations.Test;

public class SimpleRegistrationTest extends automationPracticeTestBase {

	
	@Test
	public void registerForAutomationPractice(){
		
		CreateAccountPage page = 
				new HomePageAutomation(this.driver, this.baseUrl)
				.ClickSignIn()
				.ClickCreateAnAccount();		
	}
}
