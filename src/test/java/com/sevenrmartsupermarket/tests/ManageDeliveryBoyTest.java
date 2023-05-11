package com.sevenrmartsupermarket.tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.sevenrmartsupermarket.base.Base;
import com.sevenrmartsupermarket.base.DataProviders;
import com.sevenrmartsupermarket.pages.LoginPage;
import com.sevenrmartsupermarket.pages.ManageDeliveryBoyPage;
import com.sevenrmartsupermarket.utilities.GeneralUtility;

public class ManageDeliveryBoyTest extends Base {
ManageDeliveryBoyPage managedeliveryboypage;
LoginPage loginPage;
@Test(dataProvider = "New User Creation", dataProviderClass = DataProviders.class)
public void verifyDeliveryBoyNewserCreation (String name, String email, String phoneNumber, String address, String userName,String password) {
name = name+GeneralUtility.getTimeStamp();
userName=userName+GeneralUtility.getTimeStamp();
loginPage=new LoginPage(driver);
managedeliveryboypage=new ManageDeliveryBoyPage(driver);
loginPage.loginUtility();
managedeliveryboypage.clickOnAdminUser();
managedeliveryboypage.clickOnNewButton();
managedeliveryboypage.inputDeliveryBoyDetails(userName, email, phoneNumber, address);
managedeliveryboypage.inputUserName(userName);
managedeliveryboypage.inputpassword(password);
managedeliveryboypage.clickOnSaveButton();
//String expectedAlertMessage = "Alert!";
//String actualAlertMessage = managedeliveryboypage.getUserActionAlertMessage();
//AssertJUnit.assertEquals(actualAlertMessage, expectedAlertMessage);
}
/*
@Test(dataProvider = "New DeliveryBoy User Creation Data", dataProviderClass = DataProviders.class)
Run Debug
public void verifyDeliveryBoyNewserCreations(String name, String email, String phoneNumber, String address, String userName,String password)
name = name+GeneralUtility.getTimeStamp();
userName = userName+GeneralUtility.getTimeStamp();
loginPage = new LoginPage (driver);
managedeliveryboypage = new ManageDeliveryBoyPage (driver);
loginPage.loginUtility();
managedeliveryboypage.clickOnManageDeliverBoy();
managedeliveryboypage.createUser(name, email, phoneNumber, address, userName, password);
managedeliveryboypage.clickOnSaveButton();
}*/
}