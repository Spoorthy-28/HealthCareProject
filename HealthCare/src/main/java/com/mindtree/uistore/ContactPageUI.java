package com.mindtree.uistore;

import org.openqa.selenium.By;

public class ContactPageUI {

	public By contactname = By.id("et_pb_contact_name_0");
	public By contactemail = By.id("et_pb_contact_email_0");
	public By contactmessage = By.id("et_pb_contact_message_0");
	public By submit = By.xpath("//button[@name='et_builder_submit_button']");
	public By text = By.xpath("//div[@class='et-pb-contact-message'] //p");
}
