package com.mindtree.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.uistore.ContactPageUI;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utilities.Log;

public class ContactPage extends ContactPageUI{

	
	public WebDriver driver;
	Log log = new Log();
	public ContactPage(WebDriver driver){
		this.driver = driver;
	}
	HomePageUI hpui = new HomePageUI();
	public void getcontact() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(hpui.contact).click();
		driver.findElement(contactname).sendKeys("spoorthy");
		driver.findElement(contactemail).sendKeys("abc@gmail.com");
		driver.findElement(contactmessage).sendKeys("Thankyou for the service");
		driver.findElement(submit).click();
		if(driver.findElement(text).getText().contains("Thanks for contacting us")) {
			log.infoLog("Thanks for contacting us is displayed");
		}
		else {
			log.errorLog("Thanks for contacting us is not displayed");
		}
	}
}
