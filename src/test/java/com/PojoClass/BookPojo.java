package com.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.AddactinBaseClass;

public class BookPojo extends AddactinBaseClass {
public BookPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
		@FindBy (id = "first_name")
		private WebElement firstName;

		@FindBy (id = "last_name")
		private WebElement lastName;
		
		@FindBy (id = "address")
		private WebElement address;
		
		@FindBy (id = "cc_num")
		private WebElement cardNum;
		
		@FindBy (id = "cc_type")
		private WebElement cardType;
		
		@FindBy (id = "cc_exp_month")
		private WebElement expMonth;
		
		@FindBy (id = "cc_exp_year")
		private WebElement expYear;
		
		@FindBy (id = "cc_cvv")
		private WebElement ccvNum;
		
		@FindBy (id = "book_now")
		private WebElement bookClick;

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardNum() {
			return cardNum;
		}

		public WebElement getCardType() {
			return cardType;
		}

		public WebElement getExpMonth() {
			return expMonth;
		}

		public WebElement getExpYear() {
			return expYear;
		}

		public WebElement getCcvNum() {
			return ccvNum;
		}

		public WebElement getBookClick() {
			return bookClick;
		}
		
		
		
		
		
		
		

}
