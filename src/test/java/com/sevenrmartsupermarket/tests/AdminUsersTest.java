package com.sevenrmartsupermarket.tests;

import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.pages.AdminUsersPage;
import com.sevenrmartsupermarket.pages.LoginPage;

public class AdminUsersTest extends Base{
	LoginPage loginPage;
	AdminUsersPage adminUsersPage;
	
	@Test(groups="Smoke")
	public void verifyAdminUsers() {
		
		loginPage=new LoginPage(driver);
		adminUsersPage=new AdminUsersPage(driver);
		loginPage.loginUtility();
		adminUsersPage.clickOnSaveButton();
		adminUsersPage.CreateUser("usrename", "password", "Staff");
	}

}
