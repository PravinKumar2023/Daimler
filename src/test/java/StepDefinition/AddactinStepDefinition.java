package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddactinStepDefinition {
	public static WebDriver driver;
	public static Select s;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--remote-allow-origins=*");
	   driver = new ChromeDriver(options);
	   driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}

	@When("User enter valid user name and password")
	public void user_enter_valid_user_name_and_password() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gokulkannan");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Gokul12#");
		
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}

	@Then("verified home page is isplayed")
	public void verified_home_page_is_isplayed() {
		String title = driver.getTitle();
		String k = "https://adactinhotelapp.com/SearchHotel.php";
		if (title == k) {
			
			System.out.println("Expected home page is displayed");
		}
		
	}
	@Then("user select preffered location")
	public void user_select_preffered_location() {
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);

		s.selectByIndex(5);
		
	}

	@Then("user select preffered hotel")
	public void user_select_preffered_hotel() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s = new Select(hotel);

		s.selectByIndex(3);
		
	}

	@Then("user select preffered room type")
	public void user_select_preffered_room_type() {
		WebElement roomType = driver.findElement(By.id("room_type"));
		new Select(roomType);
		s.selectByIndex(3);
			}

	@Then("user select Number of Rooms")
	public void user_select_Number_of_Rooms() {
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		new Select(roomNo);
		s.selectByIndex(3);
;
	}

	/*@Then("user select checkin date")
	public void user_select_checkin_date() {
		WebElement indate = driver.findElement(By.id("datepick_in"));

	}

	@Then("user select checkout date")
	public void user_select_checkout_date() {
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		
	}

	@Then("user select number of adults per room")
	public void user_select_number_of_adults_per_room() {
		driver.findElement(By.id("adult_room"));
		s.selectByIndex(4);
		
	}

	@Then("user select number of children per room")
	public void user_select_number_of_children_per_room() {

	}

	@Then("user click on search button")
	public void user_click_on_search_button() {

	}

	@Then("user click on radio button")
	public void user_click_on_radio_button() {

	}

	@Then("user click on continue")
	public void user_click_on_continue() {

	}

	@Then("user enter first name of username in tab")
	public void user_enter_first_name_of_username_in_tab() {

	}

	@Then("user enter last name of username in tab")
	public void user_enter_last_name_of_username_in_tab() {

	}

	@Then("user enter billing address in tab")
	public void user_enter_billing_address_in_tab() {

	}

	@Then("user enter CC number in tab")
	public void user_enter_CC_number_in_tab() {

	}

	@Then("user select Card type in dropdown")
	public void user_select_Card_type_in_dropdown() {

	}

	@Then("user select expiry month of Credit card")
	public void user_select_expiry_month_of_Credit_card() {

	}

	@Then("user select expiry year of Credit card")
	public void user_select_expiry_year_of_Credit_card() {

	}

	@Then("user enter CVV number in tab")
	public void user_enter_CVV_number_in_tab() {

	}

	@Then("verified  order number is displayed")
	public void verified_order_number_is_displayed() {

	}*/



}
