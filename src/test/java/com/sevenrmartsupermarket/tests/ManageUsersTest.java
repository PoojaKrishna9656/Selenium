package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageUsersPage;
import com.sevenrmartsupermarket.utilities.ScreenShot;

public class ManageUsersTest extends Base{
	LoginPage loginPage;
	ManageUsersPage manageUsersPage;
	ScreenShot screenshot;
	
	@Test
	public void verifyUserStatus() {
		loginPage=new LoginPage(driver);
		manageUsersPage=new ManageUsersPage(driver);
		loginPage.loginUtility();
		manageUsersPage.clickOnManageUser();
		manageUsersPage.clickOnDeActivationButton("f#12");
		screenshot.takeScreenshot(driver, "Pooja");
		
	}
	@Test
	public void verifyDeleteButton() {
		loginPage=new LoginPage(driver);
		manageUsersPage=new ManageUsersPage(driver);
		loginPage.loginUtility();
		manageUsersPage.clickOnManageUser();
		manageUsersPage.clickOnDeleteButton("Harikrishnan G");
		screenshot.takeScreenshot(driver, "Pooja");
		//String actualStatus =manageUsersPage.
	}
	
	@Test(groups="Sanity")
	public void verifySearchButton() {
		ScreenShot screenshot=new ScreenShot();
		loginPage=new LoginPage(driver);
		manageUsersPage=new ManageUsersPage(driver);
		loginPage.loginUtility();
		manageUsersPage.clickOnManageUser();
		manageUsersPage.ClickSearchButton("Ruby Varghese");
		screenshot.takeScreenshot(driver, "Pooja");
	}
	
}
