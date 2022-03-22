package com.advantageonlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingLoginPO extends PageObject{

	public ShoppingLoginPO(WebDriver driver) {
		super(driver);
		
	}
	
    //@FindBy(xpath = "//button[@id='menuUserSVGPath']") 
    @FindBy (css ="#menuUserSVGPath")
    WebElement menuUser_btn ; 
    
    //@FindBy(xpath = "//body/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[1]/div[1]/input[1]")
	@FindBy(name = "username")
	WebElement  user_name_text_Box ;
	
    @FindBy(name = "password")
    WebElement password_text_box ; 
    
    //@FindBy (css ="#sign_in_btnundefined")
    @FindBy(xpath = "//button[@id='sign_in_btnundefined']")
    WebElement sign_in_btn ; 
    
	@FindBy(xpath = "//a[@id='menuUserLink']")
	WebElement  menuUserLink_text ;
    
	
	public WebElement getMenuUser_btn() { 
		  return menuUser_btn; 
	}
	  
	public void setMenuUser_btn(WebElement menuUser_btn) { 
		this.menuUser_btn = menuUser_btn; 
	}
	 
  
	public WebElement getUser_name_text_Box() {
		return user_name_text_Box;
	}

	public void setUser_name_text_Box(WebElement user_name_text_Box) {
		this.user_name_text_Box = user_name_text_Box;
	}


	public WebElement getPassword_text_box() {
		return password_text_box;
	}

	public void setPassword_text_box(WebElement password_text_box) {
		this.password_text_box = password_text_box;
	}
	
	
	public WebElement getSign_in_btn() {
		return sign_in_btn;
	}

	public void setSign_in_btn(WebElement sign_in_btn) {
		this.sign_in_btn = sign_in_btn;
	}
	
	public WebElement getMenuUserLink_text() { 
		  return menuUserLink_text; 
	}
	  
	public void setMenuUserLink_text(WebElement menuUserLink_text) { 
		this.menuUserLink_text = menuUserLink_text; 
	}



}
