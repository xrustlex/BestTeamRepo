

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageAutomation extends PageObject {
	
	@FindBy(how=How.CSS, using="a[class='login']")
	private WebElement signInLink;
	
	
	public HomePageAutomation(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AuthenticationPage ClickSignIn() {
		signInLink.click();
		
		return new AuthenticationPage(this.driver, this.baseUrl);
	}
	
}
