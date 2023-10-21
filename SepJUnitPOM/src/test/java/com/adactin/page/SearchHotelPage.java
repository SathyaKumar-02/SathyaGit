package com.adactin.page;

import com.adactin.locators.SearchHotelPageLocators;
import com.base.utils.BaseClass;

public class SearchHotelPage extends BaseClass{

	public static void selectLocation() {
		try {
			selectByVisibleText(new SearchHotelPageLocators().getLocation(), "Melbourne");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
