package com.testbase;

import com.pages.DashboardPageWebElements;
import com.pages.LoginPageWebElements;
import com.pages.WelcomePageWebElements;

public class PageInitializer extends BaseClass{

	public static WelcomePageWebElements welcome;
	public static LoginPageWebElements login;
	public static DashboardPageWebElements dBoard;

	
	public void initializePages() {
		login=new LoginPageWebElements();
		dBoard=new DashboardPageWebElements();
		welcome= new WelcomePageWebElements();
	}
}
