package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class SearchHotelPageLocators extends BaseClass{
	
	public SearchHotelPageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
}
