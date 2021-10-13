package framework;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoTestbase {
	protected String baseUrl;
	protected WebDriver driver;
	private final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	private final String chromeDriverPath = "./src/test/resources/windows\\chromedriver.exe";

	protected autoTestbase(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	@BeforeMethod
	public void setup() {
  
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
	    driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(this.baseUrl);
	}
}
