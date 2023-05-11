package com.sevenrmartsupermarket.base;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.model.ITest;
import com.sevenrmartsupermarket.constants.Constants;
import com.sevenrmartsupermarket.utilities.ScreenShot;
import com.sevenrmartsupermarket.utilities.WaitUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	

	Properties properties = new Properties();
	FileInputStream fileinputstream;
	ScreenShot screenshot = new ScreenShot();

	public Base() {
		try {
			fileinputstream = new FileInputStream(Constants.CONFIG_FILE_PATH);
			properties.load(fileinputstream);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initilize(String browser, String url) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if (browser.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITE_WAIT));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Parameters("browser")
   @BeforeMethod(alwaysRun = true,enabled = false)
	public void lauchBrowser(String browser) {
		//String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		initilize(browser, url);
	}
	@BeforeMethod(alwaysRun = true,enabled = true)
	public void lauchBrowser() {
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		initilize(browser, url);
	}
	
	@AfterMethod(alwaysRun = true)
	public void terminateBrowser(ITestResult itest) {
		if(itest.getStatus()==ITestResult.FAILURE) {
			screenshot.takeScreenshot(driver,itest.getName() );
		}
		driver.close();
	}

}