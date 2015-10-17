package com.suvi.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simpletest {

	public static void main(String args[]) {

		WebDriver mydriver = new FirefoxDriver();
		mydriver.get("https://kanbanflow.com/login");
		mydriver.findElement(By.xpath(".//*[@id='email']")).sendKeys("balaji@gmail.com");
		mydriver.findElement(By.xpath(".//*[@id='password']")).sendKeys("balaji");
		mydriver.findElement(By.xpath(".//*[@id='loginPage-formWrapper']/form/p[4]/button")).click();

		// mydriver.quit();

	}

}
