package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public WebDriver driver;
	
	@Given("user is on login page.")
	public void user_is_on_login_page() {
	  
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@When("user enters valid user name and password.")
	public void user_enters_valid_user_name_and_password() {
	    
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Pravinips007@gmail.com");
		
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtpass.sendKeys("Java*pravin91");
		
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on login button.")
	public void user_click_on_login_button() {
	    WebElement login = driver.findElement(By.id("loginbutton"));
	    login.click();
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verifies home page is displayed")
	public void user_verifies_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
