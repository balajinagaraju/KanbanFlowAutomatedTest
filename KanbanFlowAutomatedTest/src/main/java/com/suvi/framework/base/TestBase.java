package com.suvi.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

	private WebDriver mydriver;

	public WebDriver getdriver() {

		return mydriver;

	}

	private void setDriver(String browserType, String appURL) {

		switch (browserType) {
		case "chrome":
			mydriver = initChromeDriver(appURL);
			break;
		case "firefox":
			mydriver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as default browser.");
			mydriver = initFirefoxDriver(appURL);
		}

	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome browser");
		// System.setProperty("webdriver.chrome.driver", driverPath +
		// "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	@AfterClass
	public void tearDown() {
		mydriver.quit();
	}

}
