package com.adactin.page;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{
	
	public static void adactinLogin() {
		try {
			browserOpen("chrome");
			loadUrl("https://adactinhotelapp.com/");
			//dataSend(WebElement, testData)
			//new LoginPageLocators() -> trigger the constructor
			//getUser() -> returns the WebElement
			dataSend(new LoginPageLocators().getUser(), "Muthulakshmi07");
			dataSend(new LoginPageLocators().getPwd(), "Test@123");
			click(new LoginPageLocators().getLoginBtn());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
