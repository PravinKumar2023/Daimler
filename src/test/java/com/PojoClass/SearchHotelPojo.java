package com.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.AddactinBaseClass;

public class SearchHotelPojo extends AddactinBaseClass {

public SearchHotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "location")
	private WebElement location;
	
	@FindBy (id ="hotels")
	private WebElement hotels; 
		
	@FindBy	(id = "room_type") 
	private WebElement roomType;
	
	@FindBy (id = "room_nos")
	private WebElement roomNos;
	
	@FindBy (id = "datepick_in")
	private WebElement inDate;
	
	@FindBy (id = "datepick_out")
	private WebElement outDate;
	
	@FindBy (id = "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy (id = "child_room")
	private WebElement childPerRoom;
	
	@FindBy (id = "Submit")
	private WebElement search;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getRoomNos() {
		return roomNos;
	}


	public WebElement getInDate() {
		return inDate;
	}


	public WebElement getOutDate() {
		return outDate;
	}


	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}


	public WebElement getChildPerRoom() {
		return childPerRoom;
	}


	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	

}
