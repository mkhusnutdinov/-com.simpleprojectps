package com.simpleprojectps.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.simpleprojectps.utils.Drivers;
import com.simpleprojectps.utils.Drivers.WDrivers;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Drivers.getDriver(WDrivers.CHROME), this);
	}
	
	
	@FindBy ( css = "button[type = 'submit']" )
	public WebElement loginButton;
	
	@FindBy ( css = "input[title = 'location'] " )
	public WebElement searchBar;
}
