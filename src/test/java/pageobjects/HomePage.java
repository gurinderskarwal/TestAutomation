package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver driver;
	
	By signin = By.className("login");
	


	public HomePage(WebDriver driver)	
	{

        this.driver = driver;

	}

	 /*
	  * clicks on sign in button
	 */
	 public void clickSignIn()
	 {

         driver.findElement(signin).click();

	 }
	
}
