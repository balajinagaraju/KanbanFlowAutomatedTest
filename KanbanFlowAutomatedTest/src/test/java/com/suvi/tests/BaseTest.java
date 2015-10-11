package com.suvi.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeTest
	public void setup() {

		WebDriver mydriver = new ChromeDriver();
		String BaseUrl = new String("https://kanbanflow.com/");
		mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mydriver.get(BaseUrl);

	}

}
