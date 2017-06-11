package overRiding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SuperClass {
	
	WebDriver driver;

	public void Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
	}
	
	public void Firefox()
	{
		System.setProperty("webdriver.gecko.driver","V:\\seleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
	}
	
	public void IE()
	{
		System.setProperty("webdriver.ie.driver", "V:\\SeleniumJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
	}
}
