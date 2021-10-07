package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage extends PageObject{
	
	@FindBy(how=How.XPATH, using="//div/button[@id='SubmitCreate']")
	private WebElement createAccountLink;
	
	@FindBy(how=How.CSS, using="#email_create")
	private WebElement inputEmailTextBox;
	
	public AuthenticationPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public CreateAccountPage ClickCreateAnAccount() {
		inputEmailTextBox.sendKeys("alexanderjosh006@gmail.com");
		createAccountLink.click();
		
		return new CreateAccountPage(this.driver, this.baseUrl);
	}

}
