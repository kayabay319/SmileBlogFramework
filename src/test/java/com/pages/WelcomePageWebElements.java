package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class WelcomePageWebElements extends BaseClass{

	
	@FindBy(linkText = "Login")
	public WebElement loginBtn;
	
	@FindBy(linkText ="Register")
	public WebElement registerBtn;
	

	
	public WelcomePageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
}
