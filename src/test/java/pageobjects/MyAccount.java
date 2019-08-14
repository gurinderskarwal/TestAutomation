package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount 
{
	WebDriver driver;
	By signout = By.className("logout");

	public MyAccount(WebDriver driver)	
	{

    this.driver = driver;

	}
	
	 /*
	 * clicks on sign out button
	 */
	public void signOut()
	{
	driver.findElement(signout);

	}
}