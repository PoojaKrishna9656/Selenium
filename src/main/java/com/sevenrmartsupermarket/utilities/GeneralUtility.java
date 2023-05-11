package com.sevenrmartsupermarket.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralUtility {
WebDriver driver;
public GeneralUtility(WebDriver driver) {
	this.driver=driver;
}
public String get_textOfElement(WebElement element) {
	return element.getText();
	}
public List<String> GetTextOfElements(List<WebElement> listOfelements){
	List<String> text =new ArrayList<String>();
	for(WebElement element:listOfelements) {
		String data =element.getText();
		text.add(data);
		
	}
	return text;
	}


public static String getTimeStamp() {
return new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());	

}
}