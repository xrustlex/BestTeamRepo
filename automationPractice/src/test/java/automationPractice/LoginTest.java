package automationPractice;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	@Test
	public void canLoginTest() {
		
		File file = new File("src/test/resources/chromedriver");
		String absolutePath = file.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", absolutePath);
		
		file = new File("src/test/resources/msedgedriver");
		absolutePath = file.getAbsolutePath();
		System.setProperty("webdriver.edge.driver", absolutePath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bing.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("http://automationpractice.com");
		driver.close();
		
	}
}