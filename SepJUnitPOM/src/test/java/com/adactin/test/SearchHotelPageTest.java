package com.adactin.test;

import org.junit.Test;

import com.adactin.page.LoginPage;
import com.adactin.page.SearchHotelPage;

public class SearchHotelPageTest {

	@Test
	public void location() {
		LoginPage.adactinLogin();
		SearchHotelPage.selectLocation();
	}
}
