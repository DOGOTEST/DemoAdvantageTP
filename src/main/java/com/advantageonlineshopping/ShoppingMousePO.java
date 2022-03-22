
package com.advantageonlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingMousePO extends PageObject{

	public ShoppingMousePO(WebDriver driver) {
		super(driver);
		
	}
	
    //@FindBy(xpath = "//button[@id='menuSearch']") 
    @FindBy(css = "#menuSearch")
    WebElement menuSearch_btn ; 
    
    @FindBy(css = "#autoComplete")
    //@FindBy(xpath = "//input[@id='autoComplete']") 
    WebElement autoComplete_text_btn ; 
	
    @FindBy(xpath = "//a[contains(text(),'Microsoft Sculpt Touch Mouse')]") 
	WebElement  touch_mouse_box ;
    
    @FindBy(xpath = "//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")
    WebElement plus_minus_btn ; 
    
    @FindBy(name = "save_to_cart")
    WebElement save_to_cart_btn ; 
    
    @FindBy(css = "#menuCart")
    WebElement menuCart_btn ; 
    
   //@FindBy(xpath = "//button[@id='checkOutButton']") 
    @FindBy(css = "#checkOutButton")
    WebElement checkOutButton_btn ; 
    
    @FindBy(name = "usernameInOrderPayment")
    WebElement usernameInOrderPayment_text_box ; 
   
    @FindBy(name = "passwordInOrderPayment")
    WebElement passwordInOrderPayment_text_box ; 
    
    @FindBy(css = "#login_btnundefined")
    WebElement login_btnundefined_btn ; 
    
    //@FindBy(xpath = "//button[@id='next_btn']") 
    @FindBy(css = "#next_btn")
    WebElement next_btn ; 
    
    // METHODPAYEMENT SAFEPAY
    @FindBy(name = "safepay_username")
    WebElement safepay_username_text_box ; 
   
    @FindBy(name = "safepay_password")
    WebElement safepay_password_text_box ; 
    
    @FindBy(name = "save_safepay")
    WebElement save_safepay_text_box ;
    
    //@FindBy(xpath = "//button[@id='pay_now_btn_SAFEPAY']") 
    @FindBy(css = "#pay_now_btn_SAFEPAY")
    WebElement pay_now_btn_SAFEPAY_bth ; 
    
    @FindBy(xpath = "//div[@id='orderPaymentSuccess']/h2/span")
    WebElement orderPaymentSuccess_btn ; 
   
	
	public WebElement getMenuSearch_btn() { 
		  return menuSearch_btn; 
	}
	  
	public void setMenuSearch_btn(WebElement menuSearch_btn) { 
		this.menuSearch_btn = menuSearch_btn; 
	}

	public WebElement getAutoComplete_btn() { 
		  return autoComplete_text_btn; 
	}
	  
	public void setAutoComplete_btn(WebElement autoComplete_text_btn) { 
		this.autoComplete_text_btn = autoComplete_text_btn; 
	}
  
	public WebElement getTouch_mouse_box() {
		return touch_mouse_box;
	}

	public void setTouch_mouse_box (WebElement touch_mouse_box ) {
		this.touch_mouse_box  = touch_mouse_box ;
	}


	public WebElement getPlus_minus_btn() {
		return plus_minus_btn;
	}

	public void setPlus_minus_btn(WebElement plus_minus_btn) {
		this.plus_minus_btn = plus_minus_btn;
	}

	public WebElement getSave_to_cart_btn() {
		return save_to_cart_btn;
	}
	
	public void setSave_to_cart_btn(WebElement save_to_cart_btn) {
		this.save_to_cart_btn = save_to_cart_btn;
	}
	
	public WebElement getMenuCart_btn() { 
		  return menuCart_btn; 
	}
	  
	public void setMenuCart_btn_btn(WebElement menuCart_btn) { 
		this.menuCart_btn = menuCart_btn; 
	}
	
	public WebElement getCheckOutButton_btn() { 
		  return checkOutButton_btn; 
	}
	  
	public void setCheckOutButton_btn(WebElement checkOutButton_btn) { 
		this.checkOutButton_btn = checkOutButton_btn; 
	}
	
	public WebElement getUsernameInOrderPayment_text_box() { 
		  return usernameInOrderPayment_text_box; 
	}
	  
	public void setUsernameInOrderPayment_text_box(WebElement usernameInOrderPayment_text_box) { 
		this.usernameInOrderPayment_text_box = usernameInOrderPayment_text_box; 
	}
	
	public WebElement getPasswordInOrderPayment_text_box() { 
		  return passwordInOrderPayment_text_box; 
	}
	  
	public void setPasswordInOrderPayment_text_box(WebElement passwordInOrderPayment_text_box) { 
		this.passwordInOrderPayment_text_box = passwordInOrderPayment_text_box; 
	}
	public WebElement getLogin_btnundefined_btn() { 
		  return login_btnundefined_btn; 
	}
	  
	public void setLogin_btnundefined_btn(WebElement login_btnundefined_btn) { 
		this.login_btnundefined_btn = login_btnundefined_btn; 
	}
	
	public WebElement getNext_btn() {
		return next_btn;
	}

	public void setNext_btn(WebElement next_btn) {
		this.next_btn = next_btn;
	}
	
	// METHODPAYEMENT SAFEPAY
	
	public WebElement getSafepay_username_text_box() { 
		  return safepay_username_text_box; 
	}
	  
	public void setSafepay_username_text_box(WebElement safepay_username_text_box) { 
		this.usernameInOrderPayment_text_box = safepay_username_text_box; 
	}
	
	public WebElement getSafepay_password_text_box() { 
		  return safepay_password_text_box; 
	}
	
	public WebElement getSave_safepay_text_box() {
		return save_safepay_text_box;
	}

	public void setSave_safepay_text_box(WebElement save_safepay_text_box) {
		this.save_safepay_text_box = save_safepay_text_box;
	}
	  
	public void setSafepay_password_text_box(WebElement safepay_password_text_box) { 
		this.safepay_password_text_box = safepay_password_text_box; 
	}
	public WebElement getPay_now_btn_SAFEPAY_bth() { 
		  return pay_now_btn_SAFEPAY_bth; 
	}
	  
	public void setPay_now_btn_SAFEPAY_bth(WebElement pay_now_btn_SAFEPAY_bth) { 
		this.pay_now_btn_SAFEPAY_bth = pay_now_btn_SAFEPAY_bth; 
	}
	
	public WebElement getOrderPaymentSuccess_btn() { 
		  return orderPaymentSuccess_btn; 
	}
	  
	public void setOrderPaymentSuccess_btn(WebElement orderPaymentSuccess_btn) { 
		this.orderPaymentSuccess_btn = orderPaymentSuccess_btn; 
	}


}

