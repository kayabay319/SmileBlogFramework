package com.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.DashboardPageWebElements;
import com.pages.LoginPageWebElements;
import com.pages.WelcomePageWebElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;


public class LoginPageTests extends CommonMethods{
	
	WelcomePageWebElements welcome;
	LoginPageWebElements login;
	DashboardPageWebElements dBoard;
	
	@Test (groups="cloudHomework", enabled = true)
	public void titleValidation() {
		String expTitle="Smile Blog";
		String actTitle=driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle, "Title MISMATCH");
	}
	
	@Test (groups = "cloudHomework", enabled = true)
	public void login() throws InterruptedException {
		welcome=new WelcomePageWebElements();
		click(welcome.loginBtn);
		login=new LoginPageWebElements();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		dBoard=new DashboardPageWebElements();
		String welcomeText=dBoard.welcomeText.getText();

		
		Assert.assertEquals(welcomeText, "You logged in successfully");
	}
	
	@Test (groups = "cloudHomework",dataProvider = "data", enabled = true)
	public void negativeLogin(String username, String password, String expErrMsg) {
		
		welcome=new WelcomePageWebElements();
		click(welcome.loginBtn);
		
		login=new LoginPageWebElements();
		dBoard=new DashboardPageWebElements();
		
		sendText(login.userName, username);
		sendText(login.password, password);
		click(login.loginBtn);
		
		String actErrMsg=login.errMsg.getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		
	}
	
	
	
	@DataProvider
	public Object[][] data(){
		Object[][] data = {
				{"kayabay19@gmail.com", "Admin123", "Username or Password is wrong"},
				{"kayabay19@gmail.co", "Admin123.", "Username or Password is wrong"},

		};
		return data;
	}
	
}
