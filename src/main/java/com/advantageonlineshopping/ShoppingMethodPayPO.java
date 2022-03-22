
    // METHODPAYEMENT SAFEPAY
package com.advantageonlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingMethodPayPO extends PageObject{

	public ShoppingMethodPayPO(WebDriver driver) {
		super(driver);
		
	}
	
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
   
	
	
	public WebElement getSafepay_username_text_box() { 
		  return safepay_username_text_box; 
	}
	  
	public void setSafepay_username_text_box(WebElement safepay_username_text_box) { 
		this.safepay_username_text_box= safepay_username_text_box; 
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

