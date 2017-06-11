package overRiding;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SubClass1 implements SuperClass1{
	
	WebDriver driver;

	public static void main(String args[]) 
	{
		SubClass1 browser1 = new SubClass1();
		browser1.Firefox();
		browser1.Chrome();
		browser1.IE();
	}
	
	
	public void Firefox() 
	{
		System.setProperty("webdriver.gecko.driver","V:\\seleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.co.uk/");
		driver.close();
	}
		
	@Override
	public void Chrome() 
	{
		System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		driver.close();
	}
	
	@Override
	public void IE() 
	{
		System.setProperty("webdriver.ie.driver", "V:\\SeleniumJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.co.uk/");
		driver.close();
	}

}
