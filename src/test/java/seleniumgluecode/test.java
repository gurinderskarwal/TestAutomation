package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.CreateAccount;


public class test {
    public static WebDriver driver;
    @Given("^user is on automationpractice homepage$")
    public void user_is_on_automationpractice_homepage() throws Throwable {   
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }
    
    @When("^user navigates to create account Page$")
    public void user_navigates_to_create_account_page() throws Throwable {
    	HomePage ln = new HomePage(driver);
    	ln.clickSignIn();
    	
    }
    
    @And("^user enters invalid email address$")
    public void user_enters_invalid_email_address() throws Throwable {
    	CreateAccount ca = new CreateAccount(driver);
    	ca.invalidEmail();   			
    }
    
    @And("^user click on create an account$")
    public void user_click_on_create_an_account() throws Throwable {
    	CreateAccount ca = new CreateAccount(driver);
    	ca.submitBtn();    			
    }
     
    @Then("^user see an error message for invalid email$")
    public void user_see_an_error_message_for_invalid_email() throws Throwable {
    	String error_msg = "Invalid email address.";
    	String actual = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();
        Assert.assertEquals(error_msg, actual);
        driver.quit();  
    }
    
    @Given("^user is on create account page$")
    public void user_is_on_create_account_page() throws Throwable {
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    	HomePage ln = new HomePage(driver);
    	ln.clickSignIn();
    	CreateAccount ca = new CreateAccount(driver);
    	ca.setcreateaccountemail(); 
    	ca.submitBtn();   
    }
    
    @And("^user enters valid email address$")
    public void user_enters_valid_email_address() throws Throwable {
    	CreateAccount ca = new CreateAccount(driver);
    	ca.setcreateaccountemail();   			
    }

    @When("^user adds personal details$")
    public void user_adds_personal_details() throws Throwable {
    	CreateAccount ca = new CreateAccount(driver);
    	ca.titleGender();
    	ca.firstName();
    	ca.lastName();
    	ca.password();
    	ca.days();
    	ca.months();
    	ca.years();
    	ca.newsLetter();
    	ca.specialOffers();
    	ca.company();
    	ca.address();
    	ca.addressTwo();
    	ca.city();
    	ca.state();
    	ca.postcode();
    	ca.country();
    	ca.additonalInfo();
    	ca.homePhone();
    	ca.mobile();
    	ca.futureRef();
    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button() throws Throwable {
    	CreateAccount ca = new CreateAccount(driver);
    	ca.submitAccount();
        //driver.quit(); 
    }

    @Then("^user is successfully registored$")
    public void user_is_successfully_registored() throws Throwable {
    	String welcome_txt = "Welcome to your account. Here you can manage all of your personal information and orders.";
    	String actual = driver.findElement(By.className("info-account")).getText();
        Assert.assertEquals(welcome_txt, actual);
        driver.quit();  
    }
}