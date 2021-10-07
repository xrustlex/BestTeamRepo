package automationPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class autoTestBase200 {
	
	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	String chromeDriverPath = "/src/test/resources/mac/chromedriver";
	String projectPath = System.getProperty("user.dir");	
	
	public WebDriver driver;
	protected String baseUrl; // = "http://automationpractice.com";
	
	protected autoTestBase200(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	@Before
	public void setup(){
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, projectPath + chromeDriverPath);
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(this.baseUrl);		
	}
	
}
