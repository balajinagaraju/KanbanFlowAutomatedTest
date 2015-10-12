package com.suvi.tests;

import org.testng.annotations.Test;

import com.suvi.pages.KanbanLoginPage;

public class TestKanbanLogin extends BaseTest {

	@Test
	public void LoginTest() {

		KanbanLoginPage MyLoginPage = new KanbanLoginPage();
		MyLoginPage.LoginPage("https://kanbanflow.com");
		MyLoginPage.LoginIn("balajiforyou@gmail.com", "abcd1234");

	}

}
