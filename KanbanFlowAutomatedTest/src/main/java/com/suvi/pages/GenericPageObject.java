package com.suvi.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericPageObject {

	WebDriver driver;

	public GenericPageObject() {

		driver = new ChromeDriver();
		System.out.println("ChromeDriver is instantiated");
		System.out.println(driver);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();

	}

}
