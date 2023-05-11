package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;

public class ManageDeliveryBoyPage {
	WebDriver driver;
	GeneralUtility generalUtility;
	PageUtility pageUtility;
	@FindBy(xpath = "//p[text()='Manage Delivery Boy']")
	private WebElement managedeliveryboy;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newbuttonelement;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement namebutton;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailbutton;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phonenumberbutton;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement addressbutton;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userbutton;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordbutton;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAdminUser() {
		managedeliveryboy.click();
	}

	public void clickOnNewButton() {
		newbuttonelement.click();
	}

	public void inputDeliveryBoyDetails(String name, String email, String phoneNumber, String address) {
		namebutton.sendKeys(name);
		emailbutton.sendKeys(email);
		phonenumberbutton.sendKeys(phoneNumber);
		addressbutton.sendKeys(address);
	}

	public void inputUserName(String userName) {
		userbutton.sendKeys(userName);

	}

	public void inputpassword(String password) {
		passwordbutton.sendKeys(password);

	}

	public void clickOnSaveButton() {
		savebutton.click();
		System.out.println(savebutton.getText());

	}

}
