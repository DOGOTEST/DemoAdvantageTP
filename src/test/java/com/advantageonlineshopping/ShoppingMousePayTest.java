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

public class ShoppingMousePayTest {
	static WebDriver driver ;
	String url = "https://advantageonlineshopping.com/";
	static ShoppingMousePO search ;
	static ShoppingMethodPayPO payer ;
	static ExtentReports report;
	ExtentTest test;
	
	@BeforeClass 
	public static void intialisation () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		search = new ShoppingMousePO(driver); 
		payer = new ShoppingMethodPayPO(driver);
		driver.manage().window().maximize();
		search.log.info("test pour verifier l'affichage du log ");
		report = new ExtentReports(System.getProperty("C:\\Users\\dogoe\\eclipse-workspace\\DemoAdvantageShoppingTP")+"ExtentReportResults.html");
	}

	@Test
	public void MousePayTest () throws IOException {
		driver.get(url) ;
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getMenuSearch_btn().click();
		search.log.info("test Home2 ");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.log.info("Champ de recherche ");
		search.getAutoComplete_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getAutoComplete_btn().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getAutoComplete_btn().sendKeys("MICROSOFT SCULPT TOUCH MOUSE");
		search.log.info("Valider la recherche");
		test.log(LogStatus.PASS, "Recherche dans la barre de recherche => OK");
		search.getAutoComplete_btn().sendKeys(Keys.ENTER);
		search.log.info("Recherche MOUSE OK");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getTouch_mouse_box().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getPlus_minus_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getSave_to_cart_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getSave_to_cart_btn().click();
		test.log(LogStatus.PASS, "L'article a été rajouté dans le panier");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getMenuCart_btn().click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getCheckOutButton_btn().click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getUsernameInOrderPayment_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getUsernameInOrderPayment_text_box().sendKeys("Acial_test5");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getPasswordInOrderPayment_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		search.getPasswordInOrderPayment_text_box().sendKeys("Azerty1");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		search.getLogin_btnundefined_btn().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		search.getNext_btn().click();
		test.log(LogStatus.PASS, "Connexion effectuée avant de passer au paiement");
		//Payement par SAFEPAY 
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		payer.getSafepay_username_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		payer.getSafepay_username_text_box().sendKeys("Acial_test5");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		payer.getSafepay_password_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		payer.getSafepay_password_text_box().sendKeys("Azerty1");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		payer.getSave_safepay_text_box().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		payer.getPay_now_btn_SAFEPAY_bth().click();
		test.log(LogStatus.PASS, "Paiement effecté avec succès");
		
	    try {
		      assertEquals("Thank you for buying with Advantage", payer.getOrderPaymentSuccess_btn().getText());
		    } catch (Error e) {
		      //verificationErrors.append(e.toString());
		    }
	    test.log(LogStatus.PASS, "Thank you for buying with Advantage");
		
	}

	@AfterClass 
	public static void teardown () {
		
		//driver.quit();
		//driver.close(); 

	}
		
}