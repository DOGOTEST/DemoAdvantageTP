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
public class ShoppingLoginTest {
	static WebDriver driver ;
	String url = "https://advantageonlineshopping.com/#/";
	static ShoppingLoginPO login ;
	static ExtentReports report;
	ExtentTest test;
	
	@BeforeClass 
	public static void intialisation () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login = new ShoppingLoginPO(driver); 
		driver.manage().window().maximize();
		login.log.info("test pour verifier l'affichage du log ");
		report = new ExtentReports(System.getProperty("C:\\Users\\dogoe\\eclipse-workspace\\DemoAdvantageShoppingTP")+"ExtentReportResults.html");
	}

	@Test
	public void login () throws IOException {
		test = report.startTest("Login");
		driver.get(url) ;
		test.log(LogStatus.PASS, "Se connecter");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("miceTxt")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    login.log.info("Cliquer sur le bouton USER ");
		login.getMenuUser_btn().click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login.log.info("Click dans le champ User_name ");
		//login.getUser_name_text_Box().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.log.info("Vider le champs User_Name ");
		login.getUser_name_text_Box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.log.info("Entrer le User_Name = Elie_test");
		login.getUser_name_text_Box().sendKeys("Elie_test");
		login.log.info("Vider le champs Password ");
		login.getPassword_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.log.info("Entrer le Password = Azerty1");
		login.getPassword_text_box().sendKeys("Azerty1");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.log.info("Click bouton SIGN_IN");
		login.getSign_in_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HOME")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.log.info("Verifier que le User Elie_test est connecté");
		assertEquals("Elie_test",login.getMenuUserLink_text().getText() );
		login.log.info("Le User Elie_test est bien connecté");
	}

//	
//	@Test 
//	public void scrolltoelement () {
//
//		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", login.getSign_in_btn());
//	}
//
	@AfterClass 
	public static void teardown () {
		
		//driver.quit();
		//driver.close(); 

	}
		
}