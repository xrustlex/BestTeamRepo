package automationPractice;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginTest {

	@Test
	public void canLoginTest() {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/chromedriver");	
		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/msedgedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.close();
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.close();
		
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.close();
		
	}
}