package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class LoginPageWebElements extends BaseClass{

	
	@FindBy(id="id_username")
	public WebElement userName;
	
	@FindBy(id="id_password")
	public WebElement password;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath ="//div[@class='alert alert-danger']")
	public WebElement errMsg;
	
	public LoginPageWebElements() {
		PageFactory.initElements(driver, this);
	}
}
