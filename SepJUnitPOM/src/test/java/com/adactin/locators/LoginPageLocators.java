package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass{

	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement()
	@FindBy(id="username") //used to inspect the webelement 
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(className="login_button")
	private WebElement loginBtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
