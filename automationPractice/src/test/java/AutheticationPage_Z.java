

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutheticationPage_Z extends PageObject{

	@FindBy(how=How.CSS, using="a[title='Recover your forgotten password']")
	private WebElement forgotPasswordLink;
	
	public AutheticationPage_Z(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		
	}

	public ForgotPasswordPage clickForgotPasswordLink() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage(driver,baseUrl);
		
	}

}
