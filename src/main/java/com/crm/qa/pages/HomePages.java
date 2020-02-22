package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePages extends TestBase {

	public HomePages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Log In']")
	WebElement login_btn;

	public void login_btn_click() {
		login_btn.click();
	}

	
}
