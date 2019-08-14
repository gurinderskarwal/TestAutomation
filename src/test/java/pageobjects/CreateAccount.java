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

		/*
		 * adds email in text box
		*/
		public void setcreateaccountemail()
		{
			driver.findElement(createaccountemail).sendKeys(emailRandom);

		}
		
		/*
		 * adds firstname in text box
		*/
		public void firstName()
		{
			driver.findElement(firstname).sendKeys(firstNameRandom);

		}
		
		/*
		 * adds lastname in text box
		*/
		public void lastName()
		{
			driver.findElement(lastname).sendKeys(lastNameRandom);

		}
		
		/*
		 * adds password in text box
		*/
		public void password()
		{
			driver.findElement(password).sendKeys(userpassword);

		}
		
		/*
		 * select day from dropdown
		*/
		public void days()
		{
			Select drpdowndays = new Select(driver.findElement(By.name("days")));
			drpdowndays.selectByValue("1");

		}
		
		/*
		 * select month from dropdown
		*/
		public void months()
		{
			Select drpdownmonths = new Select(driver.findElement(By.name("months")));
			drpdownmonths.selectByIndex(1);

		}
		
		/*
		 * select years from dropdown
		*/
		public void years()
		{
			Select drpdownyears = new Select(driver.findElement(By.name("years")));
			drpdownyears.selectByValue("2001");

		}
		
		/*
		 * adds company in text box
		*/
		public void company()
		{
			driver.findElement(company).sendKeys(companyRandom);

		}
		
		/*
		 * adds address in text box
		*/
		public void address()
		{
			driver.findElement(address).sendKeys(user_address);

		}
		
		/*
		 * adds second address in text box
		*/
		public void addressTwo()
		{
			driver.findElement(addresstwo).sendKeys(user_address_two);

		}
		
		/*
		 * adds city in text box
		*/
		public void city()
		{
			driver.findElement(city).sendKeys(user_city);

		}
		
		/*
		 * select state from dropdown
		*/
		public void state()
		{
			Select drpstate = new Select(driver.findElement(By.id("id_state")));
			drpstate.selectByVisibleText("Alabama");

		}
		
		/*
		 * select country from dropdown
		*/
		public void country()
		{
			Select drpcountry = new Select(driver.findElement(By.id("id_country")));
			drpcountry.selectByVisibleText("United States");

		}
		
		/*
		 * adds postcode in text box
		*/
		public void postcode()
		{
			driver.findElement(postcode).sendKeys(user_postcode);

		}
		
		/*
		 * adds additonal info in text box
		*/
		public void additonalInfo()
		{
			driver.findElement(additonalinfo).sendKeys(user_additionalinfo);

		}
		
		/*
		 * adds homePhone in text box
		*/
		public void homePhone()
		{
			driver.findElement(homephone).sendKeys(homePhoneRandom);

		}
		
		/*
		 * adds mobile in text box
		*/
		public void mobile()
		{
			driver.findElement(mobile).sendKeys(mobileRandom);

		}
		
		/*
		 * adds future reference in text box
		*/
		public void futureRef()
		{
			driver.findElement(futureref).sendKeys(user_futureref);

		}
		
		/*
		 * clicks on submit button
		*/
	    public void submitBtn()
	    {
	    	driver.findElement(submitcreate).click();

	    }
	    /*
		 * select Gendar on radio button
		*/
	    
	    public void titleGender()
	    {
	    	driver.findElement(title).click();

	    }
	    
	    /*
		 * clicks on submit account button
		*/
	    public void submitAccount()
	    {
	    	driver.findElement(submitaccount).click();

	    }
	    
	    /*
		 * selects newsLetter checkbox
		*/
	    public void newsLetter()
	    {
	    	driver.findElement(newsletter).click();

	    }
	    
	    /*
		 * selects special offers checkbox
		*/
	    public void specialOffers()
	    {
	    	driver.findElement(specialoffers).click();

	    }
	    
	    /*
		 * finds create account title
		*/
	    public String getCreateAccountTitle()
	    {
	        return    driver.findElement(titletext).getText();

	     }
	    
	    /*
		 * adds invalid email in text box
		*/
	    public void invalidEmail()
		{
			driver.findElement(createaccountemail).sendKeys(invalidemail);

		}
}
