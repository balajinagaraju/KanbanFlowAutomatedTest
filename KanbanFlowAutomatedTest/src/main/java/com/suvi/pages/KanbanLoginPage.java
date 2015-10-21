package com.suvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KanbanLoginPage {

	private WebDriver driver;

	// ####################
	// Variable definitions
	// ####################

	// The title page
	public final static String TITLE = "Login";

	// EmaildID text fields
	private By emaildIDField = By.xpath(".//*[@id='email']");

	// The password text field
	private By passwordField = By.xpath(".//*[@id='password']");

	// The Login button
	private By loginbutton = By.xpath(".//*[@id='loginPage-formWrapper']/form/p[4]/button");

	// The relative URL
	public final static String RELATIVE_URL = "/login";

	public KanbanLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getKanbanLoginPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void enterUserName(String userName) {
		WebElement emailTxtBox = driver.findElement(emaildIDField);
		if (emailTxtBox.isDisplayed())
			emailTxtBox.sendKeys(userName);
	}

	public void enterPassword(String password) {
		WebElement passwordTxtBox = driver.findElement(passwordField);
		if (passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(password);
	}

	public void clickOnLoginIn() {
		WebElement signInBtn = driver.findElement(loginbutton);
		if (signInBtn.isDisplayed())
			signInBtn.click();
	}

}
