/* Réaliser le test qui vérifie que l’article le plus populaire est « HP ELITEPAD 1000 G2 TABLE » */

package com.advantageonlineshopping;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingPopularItermsTest {
	static WebDriver driver ;
	String url = "https://advantageonlineshopping.com/";
	static ShoppingPO shopping ;
	ExtentTest test;
	
	@BeforeClass 
	public static void intialisation () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		shopping = new ShoppingPO(driver); 

		driver.manage().window().maximize();
		shopping.log.info("test pour verifier l'affichage du log ");
	}

	@Test
	public void PopularItermsTest () throws IOException {
		driver.get(url) ;
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//h3[@class='roboto-regular center ng-scope']")).click();
	   // driver.findElement(By.xpath("//a[contains(text(),'POPULAR ITEMS')]")).click();
	    // driver.findElement(By.xpath("//article[@id='popular_items']")).click();
	     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//article[@id='popular_items']")));
	    //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//p[contains(text(),'HP ELITEPAD 1000 G2 TABLET')]")));
		
	    

		

		
	}
	
	public void scrolltoelement () {

		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//article[@id='popular_items']")));
	}

	@AfterClass 
	public static void teardown () {
		
		//driver.quit();
		//driver.close(); 

	}
		
}