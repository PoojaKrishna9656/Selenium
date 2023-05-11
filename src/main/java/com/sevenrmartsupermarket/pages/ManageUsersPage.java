package com.sevenrmartsupermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmartsupermarket.utilities.GeneralUtility;
import com.sevenrmartsupermarket.utilities.PageUtility;



public class ManageUsersPage{
	WebDriver driver;
	GeneralUtility generalutility;
	PageUtility pageutility;
	@FindBy(xpath = "//p[text()='Manage Users']")
	private WebElement manageUserElement ;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")
	private List<WebElement> nameElement;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[5]/td[6]/a[1]")
	private List<WebElement> actionLockElement;
	
	
	
	//   (//table[@class='table table-bordered table-hover table-sm']//a[@class='btn btn-sm btn-danger btn-rounded'])[2]
	
	public ManageUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickOnManageUser() {
		manageUserElement.click();
	}

public void clickOnDeActivationButton(String name) {
	generalutility =new GeneralUtility(driver);
	pageutility = new PageUtility(driver);
	List<String> userName = new ArrayList<String>();
	userName=generalutility.GetTextOfElements(nameElement);
	System.out.println(userName);
	int i;
	for(i=0;i<userName.size();i++) {
		if(name.equals(userName.get(i))) {
			i++;
			break;
	
		}
	}
	WebElement deactivateButton = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr[" + i + "]/td[6]/a[1]"));
   // pageutility.scroll_into_view(deactivateButton);
	pageutility.scrolAndClick(deactivateButton);
}

public void clickOnDeleteButton(String name) {
	generalutility =new GeneralUtility(driver);
	pageutility = new PageUtility(driver);
	List<String> userName = new ArrayList<String>();
	userName=generalutility.GetTextOfElements(nameElement);
	System.out.println(userName);
	int i;
	for(i=0;i<userName.size();i++) {
		if(name.equals(userName.get(i))) {
			i++;
			break;
	
		}
	}
	WebElement deleteButton = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']/tbody/tr[" + i + "]/td[6]/a[2]"));
	pageutility.scrolAndClick(deleteButton);
	driver.switchTo().alert().accept();
}
public void ClickSearchButton(String name) {
	generalutility =new GeneralUtility(driver);
	pageutility = new PageUtility(driver);
	WebElement searchButton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	searchButton.click();
	WebElement nameButton = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	nameButton.sendKeys("Ruby Varghese");
	WebElement searchButton2 = driver.findElement(By.xpath("//button[@class='btn btn-block-sm btn-danger']"));
	searchButton2.click();
			
	
	
	
	
}
}

