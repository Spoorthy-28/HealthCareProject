package com.mindtree.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageObject.BookServicePage;
import com.mindtree.pageObject.ContactPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.resuablecomponents.Base;

public class HealthCareApplication{
	public WebDriver driver;
	Base b = new Base();
	@BeforeMethod
	public void getBrowser() throws IOException {
		driver = b.invokeBrowser();
	}
	@Test(priority=3)
	public void validateTitle() {
		HomePage hp = new HomePage(driver);
		hp.validate();
	}
	@Test(priority=1)
	public void bookingAppointment() throws InterruptedException {
		BookServicePage bsp = new BookServicePage (driver);
		bsp.bookService();
	}
	@Test(priority=2)
	public void contactUs() throws InterruptedException {
		ContactPage c = new ContactPage(driver);
		c.getcontact();
	}
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}
}
