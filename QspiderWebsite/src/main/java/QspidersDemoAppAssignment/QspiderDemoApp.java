package QspidersDemoAppAssignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QspiderDemoApp 
{

	public WebDriver driver = null;

	@BeforeClass
	public void precondition() throws IOException {
		String browser = QspiderUtility.fromProperties("browser");
		String url = QspiderUtility.fromProperties("url");
		
		if (browser != null && browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser != null && browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver(); 
		}
		else if (browser != null && browser.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else if (browser != null && browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		if (url != null) {
			driver.get(url);
		}
	}

	@Test
	public void testApp() {
		System.out.println("Title is: " + driver.getTitle());
	}
	
	@AfterClass
	public void postCondition() {
		if (driver != null) {
			driver.quit();
		}
	}	
}