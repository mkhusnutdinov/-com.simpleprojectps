package com.simpleprojectps.steptests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simpleprojectps.pages.HomePage;
import com.simpleprojectps.utils.Drivers;
import com.simpleprojectps.utils.Drivers.WDrivers;

public class SimpleUAT {
	HomePage homePage = new HomePage();
	
	@BeforeTest
	public void startUp() {
		Drivers.getDriver(WDrivers.CHROME).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Drivers.getDriver(WDrivers.CHROME).get("https://www.publicstorage.com/");
	}
	
	@Test
	public void test1() {
		homePage.searchBar.sendKeys("90006");
		homePage.loginButton.click();
	}
	
	
	
}
