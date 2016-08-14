package overRiding;

import org.testng.annotations.Test;



public class SubClass extends SuperClass{
	
@Test
public void CrossBrowser()
	{	
		SuperClass browser = new SuperClass();
		browser.Chrome();
		browser.Firefox();
		browser.IE();
	}
	
	public void Chrome()
	{
		System.out.println("Chrome Driver Executed");
	}
	
	public void Firefox()
	{
		System.out.println("Firefox Driver Executed");
	}
	
	public void IE()
	{
		System.out.println("InternetExplorer Driver Executed");
	}

}
