package com.sevenrmartsupermarket.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	JavascriptExecutor javascriptExecutor;
	Select select;

	public PageUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void scroll_into_view(WebElement element) {
		javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].scrollintoView();", element);
	}

	public void select_ByVisisbleText(String text, WebElement element) {
		select = new Select(element);
		select.selectByVisibleText(text);

	}

	/*
	 * public void fileUpload(WebElement element, String fileName) { File fileupload
	 * = new File(Constants.IMAGE_DIRECTORY+fileName+".jpeg");
	 * element.sendKeys(fileupload.getAbsolutePath());
	 */
	public void scrolAndClick(WebElement element) {
		int x = 0;
		javascriptExecutor = (JavascriptExecutor) driver;
		while (!is_clicked(element)) {
			javascriptExecutor.executeScript("window.scrollBy(0," + x + ")");
			x = x + 20;
		}

	}

	public boolean is_clicked(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
