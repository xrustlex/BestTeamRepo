package automationPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginTest {

	@Test
	public void canLoginTest() {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/mac/chromedriver");	
		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/mac/msedgedriver");
		System.setProperty("webdriver.safari.driver", projectPath + "/src/test/resources/mac/msedgedriver");

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