package pageobjects;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
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
	
	
	String emailRandom = RandomStringUtils.random(4, "testingisbeingdone") + "@" + "abc.com";
	String firstNameRandom = RandomStringUtils.randomAlphabetic(10);
	String lastNameRandom = RandomStringUtils.randomAlphabetic(10);
	String companyRandom = RandomStringUtils.random(3, "testingisbeingdone") + "company";
	String homePhoneRandom = RandomStringUtils.randomNumeric(9);
	String mobileRandom = RandomStringUtils.randomNumeric(9);
	String userpassword = "testing@1985";
	String dobday = "1";
	String dobmonth = "January";
	String dobyear = "2001";
	String user_address = "123 test street";
	String user_address_two = "123 test street two";
	String user_city = "testcity";
	String user_state = "Alabama";
	String user_postcode = "00000";
	String user_country = "test country";
	String user_additionalinfo = "test additional info";
	String user_futureref = "testfutureref";
	String invalidemail = "testemail@";

		
	public CreateAccount(WebDriver driver)	
	{

        this.driver = driver;

	}

	//set page elements

		public void setcreateaccountemail()
		{
			driver.findElement(createaccountemail).sendKeys(emailRandom);

		}
		public void firstName()
		{
			driver.findElement(firstname).sendKeys(firstNameRandom);

		}
		public void lastName()
		{
			driver.findElement(lastname).sendKeys(lastNameRandom);

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
			driver.findElement(company).sendKeys(companyRandom);

		}
		public void address()
		{
			driver.findElement(address).sendKeys(user_address);

		}
		public void addressTwo()
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
		public void additonalInfo()
		{
			driver.findElement(additonalinfo).sendKeys(user_additionalinfo);

		}
		public void homePhone()
		{
			driver.findElement(homephone).sendKeys(homePhoneRandom);

		}
		public void mobile()
		{
			driver.findElement(mobile).sendKeys(mobileRandom);

		}
		public void futureRef()
		{
			driver.findElement(futureref).sendKeys(user_futureref);

		}

	    public void submitBtn()
	    {
	    	driver.findElement(submitcreate).click();

	    }
	    
	    public void titleGender()
	    {
	    	driver.findElement(title).click();

	    }
	    
	    public void submitAccount()
	    {
	    	driver.findElement(submitaccount).click();

	    }
	    public void newsLetter()
	    {
	    	driver.findElement(newsletter).click();

	    }
	    public void specialOffers()
	    {
	    	driver.findElement(specialoffers).click();

	    }
	    
	    public String getCreateAccountTitle()
	    {

	        return    driver.findElement(titletext).getText();

	     }
	    public void invalidEmail()
		{
			driver.findElement(createaccountemail).sendKeys(invalidemail);

		}
}
