package com.suvi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KanbanLoginPage extends GenericPageObject {

	// ####################
	// Variable definitions
	// ####################

	// The title page
	public final static String TITLE = "Login";

	// The emaildID text fields
	@FindBy(xpath = ".//*[@id='email']")
	private WebElement emaildID;

	// The password text field
	@FindBy(xpath = ".//*[@id='password']")
	private WebElement password;

	// The Login button
	@FindBy(className = "loginPage-loginButton")
	private WebElement login;

	// private WebDriver mydriver;

	// The relative URL
	public final static String RELATIVE_URL = "/login";

	// public KanbanLoginPage(WebDriver driver1) {
	//
	// this.driver = driver1;
	//
	// }

	public void LoginPage(String baseURL) {

		System.out.println("URL " + baseURL + RELATIVE_URL);
		this.driver.get(baseURL + RELATIVE_URL);
		PageFactory.initElements(this.driver, BoardPage.class);
	}

	public BoardPage LoginIn(String Username, String Password) {

		emaildID.sendKeys(Username);
		password.sendKeys(Password);
		login.click();
		return PageFactory.initElements(driver, BoardPage.class);

	}

}
