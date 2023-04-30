package com.AddactinStepDefinition;

import org.openqa.selenium.support.ui.Select;

import com.BaseClass.AddactinBaseClass;
import com.PojoClass.BookPojo;
import com.PojoClass.LoginPage;
import com.PojoClass.SearchHotelPojo;
import com.PojoClass.SelectPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddactStepDefinition extends AddactinBaseClass {

public static Select s;
	
	BookPojo Bp;
	LoginPage Lp;
	SearchHotelPojo Shp;
	SelectPojo Sp;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		launchBrsr();
		openUrl("https://adactinhotelapp.com/");
		maxWindow();
	
	}

	@When("User enter valid user name and password")
	public void user_enter_valid_user_name_and_password() {
		sendValue("gokulkannan", Lp.getTxtUser());
		sendValue("Gokul12#",Lp.getPassWord());
	
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		btnClick(Lp.getLogIn());
	
	}

	@Then("verified home page is displayed")
	public void verified_home_page_is_displayed() {
		String title = driver.getTitle();
		String k = "https://adactinhotelapp.com/SearchHotel.php";
		if (title == k) {
			
			System.out.println("Expected home page is displayed");
		}
			}

	@Then("user select preffered location")
	public void user_select_preffered_location() {
		selectByIndex(Shp.getLocation(), 3);
	
	}

	@Then("user select preffered hotel")
	public void user_select_preffered_hotel() {
		selectByIndex(Shp.getHotels(), 3);
	
	}

	@Then("user select preffered room type")
	public void user_select_preffered_room_type() {

		selectByIndex(Shp.getRoomType(), 5);
	}

	@Then("user select Number of Rooms")
	public void user_select_Number_of_Rooms() {

		selectByIndex(Shp.getRoomNos(), 3);
	}

	@Then("user select checkin date")
	public void user_select_checkin_date() {
		sendValue("30/4/2023", Shp.getInDate());
	
	}

	@Then("user select checkout date")
	public void user_select_checkout_date() {
		sendValue("31/4/2023", Shp.getOutDate());
	
	}

	@When("user select number of adults per room")
	public void user_select_number_of_adults_per_room() {
		selectByIndex(Shp.getAdultsPerRoom(), 4);
	
	}

	@Then("user select number of children per room")
	public void user_select_number_of_children_per_room() {
		selectByIndex(Shp.getChildPerRoom(), 4);
	
	}

	@Then("user click on search button")
	public void user_click_on_search_button() {
		btnClick(Shp.getSearch());
	
	}

	@Then("user click on radio button")
	public void user_click_on_radio_button() {
		btnClick(Sp.getRadiobutton());
	
	}

	@Then("user click on continue")
	public void user_click_on_continue() {
		btnClick(Sp.getBtncontinue());
	}

	@When("user enter first name of username in tab")
	public void user_enter_first_name_of_username_in_tab() {
		sendValue("Pravin",Bp.getFirstName());
	
	}

	@Then("user enter last name of username in tab")
	public void user_enter_last_name_of_username_in_tab() {
		sendValue("Kumar",Bp.getLastName());
	
	}

	@Then("user enter billing address in tab")
	public void user_enter_billing_address_in_tab() {
		sendValue("Salem",Bp.getAddress());
	
	}

	@When("user enter CC number in tab")
	public void user_enter_CC_number_in_tab() {
		sendValue("87654345678765434",Bp.getCardNum());
	
	}

	@Then("user select Card type in dropdown")
	public void user_select_Card_type_in_dropdown() {
		selectByIndex(Bp.getCardType(),4);
	
	}

	@Then("user select expiry month of Credit card")
	public void user_select_expiry_month_of_Credit_card() {

		selectByIndex(Bp.getExpMonth(),4);
	}

	@Then("user select expiry year of Credit card")
	public void user_select_expiry_year_of_Credit_card() {
		selectByIndex(Bp.getExpYear(),4);
	
	}

	@Then("user enter CVV number in tab")
	public void user_enter_CVV_number_in_tab() {
		sendValue("456",Bp.getCcvNum());
	
	}

	@Then("verified  order number is displayed")
	public void verified_order_number_is_displayed() {
	  
		
	}


}
