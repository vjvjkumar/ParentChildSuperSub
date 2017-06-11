package overRiding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Parent_multipleBrowsers {
	
	WebDriver driver;
		
	public void startBrowser(String browserName, String url) throws InterruptedException {
		
		if (browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","V:\\seleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", "V:\\SeleniumJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		driver.close();
	}
}


