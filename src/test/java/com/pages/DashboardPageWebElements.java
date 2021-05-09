package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class DashboardPageWebElements extends BaseClass{

	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement welcomeText;

	
	public DashboardPageWebElements() {
		PageFactory.initElements(driver, this);
	}
}
