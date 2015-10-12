package com.suvi.pages;

import org.openqa.selenium.WebDriver;

public class Simple extends General {

	Simple(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void testsimple(WebDriver driver) {

		driver.get("http://google.com");

	}

}
