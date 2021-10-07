package automationPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class NegativePathLoginTest {

	@Test
	public void cannotLoginTest() {
		
		String testEmail = "alexanderjosh009@gmail.com";
		//String testPaswd = "monster90";
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/mac/chromedriver");	
		System.setProperty("webdriver.edge.driver",   projectPath + "/src/test/resources/mac/msedgedriver");
		System.setProperty("webdriver.safari.driver", projectPath + "/src/test/resources/mac/msedgedriver");

		//Chrome run
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		WebElement signInLink = driver.findElement(By.cssSelector("a[class='login']"));
		signInLink.click();
		WebElement emailBox = driver.findElement(By.cssSelector("input#email"));
		emailBox.sendKeys(testEmail);
		WebElement passwordBox = driver.findElement(By.cssSelector("input#passwd"));
		//passwordBox.sendKeys(testPaswd);
		passwordBox.sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication");
		driver.close();
		
	}
}
