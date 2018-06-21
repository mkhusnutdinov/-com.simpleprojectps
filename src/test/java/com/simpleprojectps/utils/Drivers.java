package com.simpleprojectps.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	private static WebDriver driver;
	
	public static WebDriver getDriver(WDrivers drivers) {
		if(driver == null) {
			switch(drivers) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		return driver;
	}
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	public static enum WDrivers{
		CHROME, FIREFOX
	}
}
