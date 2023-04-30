package com.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.AddactinBaseClass;

public class SelectPojo extends AddactinBaseClass {

	public SelectPojo () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy (id = "continue")
	private WebElement btncontinue;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

}
