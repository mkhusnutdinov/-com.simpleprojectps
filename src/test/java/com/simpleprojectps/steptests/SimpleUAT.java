package com.simpleprojectps.steptests;

import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simpleprojectps.pages.HomePage;
import com.simpleprojectps.utils.Drivers;
import com.simpleprojectps.utils.Drivers.WDrivers;

public class SimpleUAT {
	HomePage homePage = new HomePage();
	static WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		driver = Drivers.getDriver(WDrivers.CHROME);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.publicstorage.com/");
	}
	
	@Test(priority = 1)
	public void homePageSearchBarTest() {
		homePage.searchBar.sendKeys("90006");
		homePage.loginButton.click();
	}
	
	@Test(priority = 2)
	public void testToFail() {
		assertEquals("a","b");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
}
