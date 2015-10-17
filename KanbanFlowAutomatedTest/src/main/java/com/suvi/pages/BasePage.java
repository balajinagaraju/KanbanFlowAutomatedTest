package com.suvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	private By signUpButton = By.linkText("Sign up");

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean verifyBasePageTitle() {
		String expectedPageTitle = "kanbanflow";
		return getPageTitle().contains(expectedPageTitle);
	}

}
