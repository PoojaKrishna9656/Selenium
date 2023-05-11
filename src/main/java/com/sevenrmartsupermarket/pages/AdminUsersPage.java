package com.sevenrmartsupermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUsersPage {
	WebDriver driver;
	GeneralUtility generalUtility;
	PageUtility pageUtility;
	@FindBy(xpath = "//p[text()='Admin Users']")
	private WebElement adminUsersElement;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newButtonElement;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameElement;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordElement;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userTypeElement;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	private WebElement SaveButtonElement;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']//i[@class=' fa fa-search']")
	private WebElement searchElement;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnAdminUser() {
		adminUsersElement.click();
	}

	public void clickOnNewButton() {
		newButtonElement.click();
	}

	public void inputUserName(String userName) {
		userNameElement.sendKeys(userName);

	}

	public void inputpassword(String password) {
		passwordElement.sendKeys(password);

	}

	public void clickOnSaveButton() {
		SaveButtonElement.click();
		System.out.println(SaveButtonElement.getText());

	}
	public void clickOnSearchButton() {
		searchElement.click();
	}

	public void CreateUser(String usersName, String password, String UserType) {
		pageUtility = new PageUtility(driver);
		clickOnSaveButton();
		inputUserName(usersName);
		inputpassword(password);
		pageUtility.select_ByVisisbleText(UserType, userTypeElement);
		clickOnSaveButton();

	}

}
