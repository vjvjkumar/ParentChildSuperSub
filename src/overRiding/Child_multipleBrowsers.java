package overRiding;

import org.junit.Test;

public class Child_multipleBrowsers extends Parent_multipleBrowsers{
	
@Test
public void CrossBrowser() throws InterruptedException {
	
		Parent_multipleBrowsers browser = new Parent_multipleBrowsers();
		browser.startBrowser("Firefox", "http://amazon.com/");
		browser.startBrowser("Chrome", "http://ebay.com/");
		browser.startBrowser("IE", "http://facebook.com/");
		
	}
		
	public void startBrowser(String browserName, String url)
	{
		System.out.println("Multiple Browsers Executed");
	}

}
