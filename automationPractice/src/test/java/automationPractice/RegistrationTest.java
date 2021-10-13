package automationPractice;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	@Test
	public void registerForAutomationPractice() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/mac/chromedriver");
		
		
		//Chrome run
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		
		//Click on Sign-In
		WebElement signInLink = driver.findElement(By.cssSelector("a[class='login']"));
		signInLink.click();
		
		//Input into Register Email and click 
		WebElement inputEmailTextBox = driver.findElement(By.cssSelector("#email_create"));
		inputEmailTextBox.sendKeys("alexanderjosh006@gmail.com");
		
		WebElement createAccountLink = driver.findElement(By.xpath("//div/button[@id='SubmitCreate']"));
		createAccountLink.click();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		//Fill Out Form  //div/input[@id='customer_firstname']
		WebElement firstNameTextField = driver.findElement(By.cssSelector("div input[id='customer_firstname']"));
		firstNameTextField.sendKeys("John");
		
		WebElement lastNameTextField = driver.findElement(By.cssSelector("div input[id='customer_lastname']"));
		lastNameTextField.sendKeys("Doe");
		
		WebElement passWordTextField = driver.findElement(By.cssSelector("div input[id='passwd']"));
		passWordTextField.sendKeys("Password");
		
		WebElement phoneNumberTextField = driver.findElement(By.cssSelector("div p input[id='phone_mobile']"));
		phoneNumberTextField.sendKeys("1234567890");
		
		
		//Click Submit Button
		WebElement submitRegisterButton = driver.findElement(By.cssSelector("div[class='submit clearfix'] button[id='submitAccount']"));
		submitRegisterButton.click();
		
		
		

	}

}
