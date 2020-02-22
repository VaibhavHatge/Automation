package com.crm.qa.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePages;

public class HomePagesTest extends TestBase {

	HomePages homepages;

	HomePagesTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		homepages = new HomePages();
		initialization();

	}

	@Test
	public void TestloginBtn()
	{
		homepages.login_btn_click();
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
