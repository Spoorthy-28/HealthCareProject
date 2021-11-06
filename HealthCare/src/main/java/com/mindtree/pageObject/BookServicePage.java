package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.BookServicePageUI;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.Log;

public class BookServicePage extends BookServicePageUI{
	public WebDriver driver;
	Log log = new Log();
	public BookServicePage(WebDriver driver){
		this.driver = driver;
	}
	HomePageUI hpui = new HomePageUI();
	public void bookService() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(hpui.booking_available_services).click();
		driver.findElement(home_care).click();
		Thread.sleep(20000);
		driver.findElement(date).click();
		driver.findElement(name).sendKeys("spoorthy");
		driver.findElement(email).sendKeys("abc@gmail.com");
		driver.findElement(mobileno).sendKeys("123456789");
		driver.findElement(confirm_booking).click();
		if(driver.findElement(text).getText().contains("Thank You")) {
			log.infoLog("Appointment booked successfully and navigated to thankyou page!");
		}
		else {
			log.errorLog("Thank you page is not displayed");
		}
	}
}
