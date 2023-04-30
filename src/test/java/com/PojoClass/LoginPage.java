package com.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.AddactinBaseClass;

public class LoginPage extends AddactinBaseClass {
	 {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (id="username")
	private WebElement txtUser;
	WebElement txtuser;
	
	@FindBy (id="password")
	private WebElement passWord;
	WebElement password;

	@FindBy (id="login")
	private WebElement logIn;
	WebElement login;
	
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	
	public WebElement getPassWord() {
		return passWord;
	}
	
	public WebElement getLogIn() {
		return logIn;
	}
	


	
	}
	
	

