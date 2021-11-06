package com.mindtree.uistore;

import org.openqa.selenium.By;

public class BookServicePageUI {
	public By home_care = By.xpath("(//button[@type='button'])[1]");
	public By date = By.xpath("//td[@data-date='30']");
	public By name = By.id("emsb_user_fullName");
	public By email = By.id("emsb_user_email");
	public By mobileno = By.id("emsb_user_telephone");
	public By confirm_booking = By.id("submitForm");
	public By text = By.xpath("(//h4)[5]");
}
