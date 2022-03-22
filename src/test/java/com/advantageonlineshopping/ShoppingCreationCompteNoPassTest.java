
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
public class ShoppingCreationCompteNoPassTest {
	static WebDriver driver ;
	String url = "http://advantageonlineshopping.com/#/register";
	static ShoppingCreationComptePO compte ;
	static ExtentReports report;
	ExtentTest test;
	
	@BeforeClass 
	public static void intialisation () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		compte = new ShoppingCreationComptePO(driver); 
		driver.manage().window().maximize();
		compte.log.info("test pour verifier l'affichage du log ");
		report = new ExtentReports(System.getProperty("C:\\Users\\dogoe\\Documents\\DemoAdvantageShopping")+"ExtentReportResults.html");
	}

	@Test
	public void creer_un_copmte () throws IOException {
		test = report.startTest("creer_un_compte");
		driver.get(url) ;
		test.log(LogStatus.PASS, "Lancement du site");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getUser_name_text_Box().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		compte.getUser_name_text_Box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getUser_name_text_Box().sendKeys("");
	
		compte.log.info("je tape le ELie_test");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getEmail_text_box().click();
		assertEquals("Username field is required",compte.getWarning_text().getText() );
		//assertEquals("Use 5 character or longer",compte.getWarning_text().getText() );
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getEmail_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getEmail_text_box().sendKeys("test@acial.com");
		compte.getPassword_text_box().click();
		//assertEquals("Email field is required",compte.getWarning_text().getText() );
		//assertEquals("Your email address isn't formatted correctly",compte.getWarning_text().getText() );
		compte.getPassword_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getPassword_text_box().sendKeys("Azerty1");
		
		compte.getConfirm_password_text_box().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getConfirm_password_text_box().sendKeys("Azerty1");
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getFirst_name().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getFirst_name().clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getFirst_name().sendKeys("Testeur");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getLast_name().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getLast_name().sendKeys("Acial");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getPhone_number().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getPhone_number().sendKeys("075689648");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select anyName = new Select(compte.getCountry());	
		anyName.selectByVisibleText("France");
		compte.getCity().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getCity().sendKeys("Paris");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getAddresse().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getAddresse().sendKeys("Champs Elysée");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		compte.getRegionRegisterPage().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getRegionRegisterPage().sendKeys("Parisienne");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		compte.getPostal_code().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		compte.getPostal_code().sendKeys("75017");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		compte.getI_agree_checkbox().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		compte.getRegistre_btn().click();
		//assertEquals("Registration failed. Please try again.",compte.getWarning_text().getText() );
		
		
	}


	@AfterClass 
	public static void teardown () {
		
		//driver.quit();
		//driver.close(); 

	}
	
	@After
	public void end_test() {
		report.endTest(test); 
		report.flush(); 
	}
	

}

