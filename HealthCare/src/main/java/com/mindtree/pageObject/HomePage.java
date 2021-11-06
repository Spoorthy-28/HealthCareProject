package com.mindtree.pageObject;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.Log;

public class HomePage extends HomePageUI{
	public WebDriver driver;
	Log log = new Log();
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	public void validate() {
		driver.findElement(booking_available_services).click();
		Assert.assertEquals(driver.getTitle(), "Services | Healthcare");
		log.infoLog("Title is Validated!"); 
	}
}
