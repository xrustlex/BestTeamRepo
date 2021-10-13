

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage extends PageObject{
	
	@FindBy(how=How.CSS, using="div input[id='customer_firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(how=How.CSS, using="div input[id='customer_lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(how=How.CSS, using="div input[id='passwd']")
	private WebElement passWordTextField;
	
	@FindBy(how=How.CSS, using="div p input[id='phone_mobile']")
	private WebElement phoneNumberTextField;
	
	@FindBy(how=How.CSS, using="div[class='submit clearfix'] button[id='submitAccount']")
	private WebElement submitRegisterButton;
	
	public CreateAccountPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		firstNameTextField.sendKeys("John");
		lastNameTextField.sendKeys("Doe");
		passWordTextField.sendKeys("Password");
		phoneNumberTextField.sendKeys("1234567890");
		submitRegisterButton.click();
	}
	
}
