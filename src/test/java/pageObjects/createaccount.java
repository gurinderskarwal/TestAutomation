package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount 
{
	
	WebDriver driver;

	By createaccountemail = By.name("email_create");
	By submitcreate = By.name("SubmitCreate");
	By titletext = By.className("page-heading");
	By title = By.id("id_gender1");
	By firstname = By.id("customer_firstname");
	By lastname = By.id("customer_lastname");
	By password = By.id("passwd"); 
	//By days = By.id("days");
	//By months = By.id("months");
	//By years = By.id("years");
	By newsletter = By.id("newsletter");
	By specialoffers = By.id("optin");
	By company = By.id("company");
	By address = By.id("address1");
	By addresstwo = By.id("address2");
	By city = By.id("city");
	By state = By.id("id_state");
	By postcode = By.id("postcode");
	By country = By.id("id_country");
	By additonalinfo = By.id("other");
	By homephone = By.id("phone");
	By mobile = By.id("phone_mobile");
	By futureref = By.id("alias");
	By submitaccount = By.id("submitAccount");
	
	
	String createemail = "testemail18@gmail.com";
	String first_name = "test firstname";
	String last_name = "test lastname";
	String userpassword = "testing@1985";
	String dobday = "1";
	String dobmonth = "January";
	String dobyear = "2001";
	String user_company = "abc company";
	String user_address = "123 test street";
	String user_address_two = "123 test street two";
	String user_city = "testcity";
	String user_state = "Alabama";
	String user_postcode = "00000";
	String user_country = "test country";
	String user_additionalinfo = "test additional info";
	String user_homephone = "123456789";
	String user_mobile = "987654321";
	String user_futureref = "testfutureref";
	String invalidemail = "testemail@";

		
	public createaccount(WebDriver driver)	
	{

        this.driver = driver;

	}

	//set page elements

		public void setcreateaccountemail()
		{
			driver.findElement(createaccountemail).sendKeys(createemail);

		}
		public void firstname()
		{
			driver.findElement(firstname).sendKeys(first_name);

		}
		public void lastname()
		{
			driver.findElement(lastname).sendKeys(last_name);

		}
		public void password()
		{
			driver.findElement(password).sendKeys(userpassword);

		}
		public void days()
		{
			Select drpdowndays = new Select(driver.findElement(By.name("days")));
			drpdowndays.selectByValue("1");

		}
		public void months()
		{
			Select drpdownmonths = new Select(driver.findElement(By.name("months")));
			drpdownmonths.selectByIndex(1);

		}
		public void years()
		{
			Select drpdownyears = new Select(driver.findElement(By.name("years")));
			drpdownyears.selectByValue("2001");

		}
		public void company()
		{
			driver.findElement(company).sendKeys(user_company);

		}
		public void address()
		{
			driver.findElement(address).sendKeys(user_address);

		}
		public void addresstwo()
		{
			driver.findElement(addresstwo).sendKeys(user_address_two);

		}
		public void city()
		{
			driver.findElement(city).sendKeys(user_city);

		}
		public void state()
		{
			Select drpstate = new Select(driver.findElement(By.id("id_state")));
			drpstate.selectByVisibleText("Alabama");

		}
		public void country()
		{
			Select drpcountry = new Select(driver.findElement(By.id("id_country")));
			drpcountry.selectByVisibleText("United States");

		}
		public void postcode()
		{
			driver.findElement(postcode).sendKeys(user_postcode);

		}
		public void additonalinfo()
		{
			driver.findElement(additonalinfo).sendKeys(user_additionalinfo);

		}
		public void homephone()
		{
			driver.findElement(homephone).sendKeys(user_homephone);

		}
		public void mobile()
		{
			driver.findElement(mobile).sendKeys(user_mobile);

		}
		public void futureref()
		{
			driver.findElement(futureref).sendKeys(user_futureref);

		}

	    public void submitbtn()
	    {
	    	driver.findElement(submitcreate).click();

	    }
	    
	    public void titlegender()
	    {
	    	driver.findElement(title).click();

	    }
	    
	    public void submitaccount()
	    {
	    	driver.findElement(submitaccount).click();

	    }
	    public void newsletter()
	    {
	    	driver.findElement(newsletter).click();

	    }
	    public void specialoffers()
	    {
	    	driver.findElement(specialoffers).click();

	    }
	    
	    public String getcreateaccounttitle()
	    {

	        return    driver.findElement(titletext).getText();

	     }
	    public void invalidemail()
		{
			driver.findElement(createaccountemail).sendKeys(invalidemail);

		}
}
