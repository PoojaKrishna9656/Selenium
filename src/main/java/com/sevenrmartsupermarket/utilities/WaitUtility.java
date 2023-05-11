package com.sevenrmartsupermarket.utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriverWait wait;
	WebDriver driver;

	public static final long IMPLICITE_WAIT = 10;
	public static final long EXPLICITE_WAIT = 10;

	public WaitUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForElementToBeVisisble(String xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

	public void waitForElementToBeVisisble(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void waitForElementToBeClickable(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementToBeClickable(String xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void waitForElementToBeInvisible(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitForElementToBeInvisible(String xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITE_WAIT));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}
}
