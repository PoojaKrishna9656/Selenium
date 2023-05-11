package com.sevenrmartsupermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.base.DataProviders;
import com.sevenrmartsupermarket.pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginPage;
	
	@Test
	public void verifySuperMarketlogo() {
		

	}
	@Test(dataProvider = "Login",dataProviderClass = DataProviders.class)
		public void verifyLoginFunctionality(String userName,String password ) {
		loginPage = new LoginPage(driver);
		loginPage.loginUtility();
		String expectedProfileName ="Admin";
		String actualProfileName = loginPage.getProfileText();
		Assert.assertEquals(actualProfileName, expectedProfileName);
	}
}