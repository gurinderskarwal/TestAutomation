package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myaccount 
{
	WebDriver driver;
	By signout = By.className("logout");

	public myaccount(WebDriver driver)	
	{

    this.driver = driver;

	}
	public void signout()
	{
	driver.findElement(signout);

	}
}