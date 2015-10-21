package com.suvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KanbanHomePage {

	private WebDriver driver;

	private By LoginToKanban = By.xpath(".//*[@id='navigation']/li[6]/a");
	private By FullName = By.xpath(".//*[@id='fullName']");
	private By emailTextBox = By.xpath(".//*[@id='email']");
	private By passwordTextBox = By.xpath(".//*[@id='password']");
	private By SingUpButton = By.xpath(".//*[@id='home-signUpFormWrapper']/form/p[4]/button");

	public KanbanHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getKanbanHomePageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean verifyKanbanHomePageTitle() {
		String expectedTitle = "KanbanFlow-Lean project";
		return getKanbanHomePageTitle().contains(expectedTitle);
	}

	public KanbanLoginPage clickOnLogin() {
		WebElement element = driver.findElement(LoginToKanban);
		if (element.isDisplayed() || element.isEnabled())
			element.click();
		return new KanbanLoginPage(driver);
	}

}