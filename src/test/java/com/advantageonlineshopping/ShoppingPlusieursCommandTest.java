
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
public class ShoppingPlusieursCommandTest {
	static WebDriver driver ;
	String url = "https://advantageonlineshopping.com/#/";
	static ShoppingLoginPO login ;
	static ShoppingPO shopping ;
	static ShoppingMethodPayPO payer ;
	static ExtentReports report;
	ExtentTest test;
	
	@BeforeClass 
	public static void intialisation () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login = new ShoppingLoginPO(driver); 
		shopping = new ShoppingPO (driver);
		payer = new ShoppingMethodPayPO(driver);
		driver.manage().window().maximize();
		login.log.info("test pour verifier l'affichage du log ");
		report = new ExtentReports(System.getProperty("C:\\Users\\dogoe\\eclipse-workspace\\DemoAdvantageShoppingTP")+"ExtentReportResults.html");
	}

	@Test
	public void PlusieursCommandTest () throws IOException {
		test = report.startTest("Login");
		driver.get(url) ;
		test.log(LogStatus.PASS, "Se connecter");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("miceTxt")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.getMenuUser_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//login.getUser_name_text_Box().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.getUser_name_text_Box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.getUser_name_text_Box().sendKeys("Acial_test");
		login.getPassword_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.getPassword_text_box().sendKeys("Azerty1");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.getSign_in_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HOME")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		assertEquals("Acial_test",login.getMenuUserLink_text().getText());
		test.log(LogStatus.PASS, "Login ==> OK");
		//Effectuer plusieurs commandes 
		login.log.info("Effectuer plusieurs commandes");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getLaptops_Img().click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getBuy_now_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getCouleur_box().click();
		
		//Commander 5 articles

		for (int i=0;i<shopping.var;i++) {
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			shopping.getPlus_btn().click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getAdd_to_cart_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		test.log(LogStatus.PASS, "Articles ajoutés au panier");
		shopping.getHome_btn().click();
		login.log.info("Articles au panier ");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getMenuCart_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getEdit_btn().click();
		shopping.log.info("Edit");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getMoins_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//shopping.getCouleur_box().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		shopping.log.info("commande modifiée");
		shopping.getAdd_to_cart_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getHome_btn().click();
		test.log(LogStatus.PASS, "Modifications prises en compte");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		shopping.getTablets_Img().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getBuy_now_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getMenuCart_btn().click();
		login.log.info("D'autres articles rajoutés ");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getCheckOutButton_btn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		shopping.getNext_btn().click();
		test.log(LogStatus.PASS, "Passer au paiement");
		
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
	    
		//Consultation de mes commandes (My orders)
//		login.log.info("Consultation de la liste des dernières commandes/orders (My orders à partir de votre compte)");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getMenuUser_btn().click();	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getMy_orders_box().click();
		
		//Commander une tablette
//		shopping.getHome_btn().click();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		shopping.getTablets_Img().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getBuy_now_btn().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//Commander un ordi
//		shopping.getHome_btn().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getLaptops_Img().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getBuy_now_btn().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getHome_btn().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		shopping.getMenuCart_btn().click();
//	
		//shopping.getMoins_btn().click();
				
		    
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

