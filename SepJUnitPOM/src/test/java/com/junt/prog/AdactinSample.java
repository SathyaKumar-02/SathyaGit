package com.junt.prog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

public class AdactinSample extends BaseClass{

	@BeforeClass
	public static void execStart() {
		System.out.println("Execution started");
	}
	
	@Before 
	public void launchURL() {
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/");
	}
	
	@Test
	public void loginWithValidUserAndValidPwd() {
		WebElement user = findElementById("username");
		WebElement pwd = findElementById("password");
		WebElement login = findElementById("login");
		user.sendKeys("Muthulakshmi");
		pwd.sendKeys("Test@123");
		login.click();
		
	}
	
	@After
	public void closeBrowser() {
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username_show']")));
		try {
		WebElement userName = findElementByXpath("//*[@id='username_show']");
		if(userName.isDisplayed()) {
			System.out.println("User logged in");
		}
		
		pageClose();
		}catch(NoSuchElementException e) {
			System.out.println("User not logged in");
		}
	}
	
	@AfterClass
	public static void execDone() {
		System.out.println("Execution completed");
	}
}
