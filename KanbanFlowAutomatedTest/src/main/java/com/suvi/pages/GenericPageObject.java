package com.suvi.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericPageObject {

	WebDriver driver;

	public GenericPageObject() {

		// The below option is added to overcome an certificate error.
		// "You are using an unsupported command-line flag:
		// --ignore-certifcate-errors. Stability and security will suffer."
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("test-type");
		//
		// driver = new ChromeDriver(options);

		// using firefox driver since chromedriver is having some problem. Will
		// switch to chrome once that is solved.

		driver = new FirefoxDriver();
		System.out.println("Firefox driver is instantiated");
		System.out.println(driver);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();

	}

}
