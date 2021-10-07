package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
	
	public WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) 	return new ChromeDriver();
		if (browser.equals("edge")) 	return new EdgeDriver();
		if (browser.equals("safari")) 	return new ChromeDriver();

		return null;
		
	}
}
