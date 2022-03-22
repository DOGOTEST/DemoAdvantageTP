package com.advantageonlineshopping;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.Lock;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver ;
	public Logger log ;

	public PageObject(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        log = LogManager.getLogger(Lock.class.getName()); 
       
	}
	
	public void screenshot() throws IOException {
		 File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(picture, new File ("C:\\Users\\dogoe\\eclipse-workspace\\DemoAdvantageShoppingTP\\TestShopping.png"));
		
	}
	
	

}
