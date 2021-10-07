package automationPractice.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationPractice.PageObject;

public class ForgotPasswordPage extends PageObject {

	@FindBy(how=How.ID, using="email")
	private WebElement email;
	@FindBy(how=How.XPATH, using="//span[text()='Retrieve Password']")
	private WebElement retrievePassword;
	private String textScript = "return document.evaluate(\"*[@id='center_column']/div/p/following-sibling::text()[1]\" ,document, null, XPathResult.STRING_TYPE, null).stringValue;";

	
	public ForgotPasswordPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		
	}

	public ForgotPasswordPage clickRetrievePassword() {
		email.sendKeys("abcxxx@gmail.com");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(retrievePassword));
		retrievePassword.click();
		return new ForgotPasswordPage(driver,baseUrl);
		
	}
	
	public String getMessage() {
		String message = (String)super.executeJavascript(textScript, null);
		
		return message.trim();
	}

}
