package com.suvi.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.suvi.framework.base.TestBase;
import com.suvi.pages.BasePage;

public class BaseTest extends TestBase {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getdriver();
	}

	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePage basePage = new BasePage(driver);
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
	}

}
