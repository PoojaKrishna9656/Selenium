package com.sevenrmartsupermarket.base;

import org.apache.poi.util.CodePageUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.PageUtility;

public class AdminUsersPage {
	WebDriver driver;
	@FindBy(xpath ="//li[18]//a[@class=' nav-link']//i[1]")
	private WebElement adminUsersElement;
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']" )
	private WebElement newButtonElement;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userNameElement;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordElement;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userTypeElement;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	private WebElement SaveButtonElement;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickonAdminUsers() {
		adminUsersElement.click();
	}
	public void clickonNewButton() {
		newButtonElement.click();
	}
		
	
	public void inputUserName(String userName) {
		userNameElement.sendKeys(userName);
		
	}
	public void Password(String password) {
		passwordElement.sendKeys(password);
		
	}
	public void clickOnSaveButton() {
		SaveButtonElement.click();
		
	}
	
public void createUser(String usersName,String passWord,String UserType) {
	pageUtility =new PageUtility(driver);
	
	ClickOnNewButton();
	inputUserName(userName);
	inputpassword(password);
	pageUtility.select_ByVisibleText(userType,userTypeElement);
	clickOnSaveButton();
	
}

}
