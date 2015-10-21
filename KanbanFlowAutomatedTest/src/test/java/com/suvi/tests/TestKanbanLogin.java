package com.suvi.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.suvi.framework.base.TestBase;
import com.suvi.pages.BasePage;
import com.suvi.pages.KanbanLoginPage;

public class TestKanbanLogin extends TestBase {

	private WebDriver driver;
	private KanbanLoginPage KanbanLoginPage;
	private BasePage basePage;

	@BeforeClass
	public void setUp() {
		driver = getdriver();
	}

	@Test
	public void verifyLoginInFunction() {
		System.out.println("Login In Test");
		basePage = new BasePage(driver);

	}

}
