package pageObjects;

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

//Click on sign in on home page
	 public void clicksignin()
	 {

         driver.findElement(signin).click();

	 }
	
}
