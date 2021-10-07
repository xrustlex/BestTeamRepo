package automationPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Assert;

public class LoginTest {

	@Test
	public void canLoginTest() {

		String testEmail = "alexanderjosh009@gmail.com";
		String testPaswd = "monster90";
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/mac/chromedriver");	
		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/mac/msedgedriver");
		System.setProperty("webdriver.safari.driver", projectPath + "/src/test/resources/mac/msedgedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");

		WebElement signInLink = driver.findElement(By.cssSelector("a[class='login']"));
		signInLink.click();
		WebElement emailBox = driver.findElement(By.cssSelector("body[id='authentication']"));
		emailBox.sendKeys(testEmail);
		WebElement passwordBox = driver.findElement(By.cssSelector("input[name='passwrd']"));
		passwordBox.sendKeys(testPaswd);
		passwordBox.sendKeys(Keys.ENTER);

		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");

		driver.close();

		/*
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.close();

		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.close();
		 */
	}
}