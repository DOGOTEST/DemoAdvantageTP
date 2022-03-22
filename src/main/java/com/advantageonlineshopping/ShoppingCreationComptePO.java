package com.advantageonlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCreationComptePO extends PageObject{

	public ShoppingCreationComptePO(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "usernameRegisterPage")
	WebElement  user_name_text_Box ;
	
    @FindBy(name = "emailRegisterPage")
    WebElement email_text_box ; 
    
    @FindBy(name = "passwordRegisterPage")
    WebElement password_text_box ; 
    
    @FindBy(name = "confirm_passwordRegisterPage")
    WebElement confirm_password_text_box ; 
    
    @FindBy(xpath ="//input[@name='first_nameRegisterPage']")
    WebElement first_name; 
    
    @FindBy(xpath = "//input[@name='last_nameRegisterPage']")
    WebElement last_name ; 
    
    @FindBy(xpath = "//input[@name='phone_numberRegisterPage']")
    WebElement phone_number ;  
    
    @FindBy(xpath = "//input[@name='cityRegisterPage']")
    WebElement city; 
    
    @FindBy(xpath = "//input[@name='addressRegisterPage']")
    WebElement addresse ; 
    
    @FindBy(xpath = "//input[@name='state_/_province_/_regionRegisterPage']")
    WebElement regionRegisterPage ; 
    
    @FindBy (xpath = "//input[@name='postal_codeRegisterPage']") 
    WebElement postal_code ; 
    
    @FindBy (xpath = "//input[@name='i_agree']") 
    WebElement i_agree ; 
    
    @FindBy(xpath = "//button[@id='register_btnundefined']")
    WebElement registre_btn ; 
    
    @FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label")
    WebElement warning_text ; 
 
   @FindBy(xpath = "//select[@name='countryListboxRegisterPage']")
   WebElement country ;
   
	public WebElement getCountry() {
	return country;
}

	
public void setCountry(WebElement country) {
	this.country = country;
}

	public WebElement getWarning_text() {
		return warning_text;
	}

	public void setWarning_text(WebElement warning_text) {
		this.warning_text = warning_text;
	}

	public WebElement getUser_name_text_Box() {
		return user_name_text_Box;
	}

	public void setUser_name_text_Box(WebElement user_name_text_Box) {
		this.user_name_text_Box = user_name_text_Box;
	}

	public WebElement getEmail_text_box() {
		return email_text_box;
	}

	public void setEmail_text_box(WebElement email_text_box) {
		this.email_text_box = email_text_box;
	}

	public WebElement getPassword_text_box() {
		return password_text_box;
	}

	public void setPassword_text_box(WebElement password_text_box) {
		this.password_text_box = password_text_box;
	}
	
	public WebElement getConfirm_password_text_box() {
		return confirm_password_text_box;
	}

	public void setConfirm_password_text_box(WebElement confirm_password_text_box) {
		this.confirm_password_text_box = confirm_password_text_box;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public WebElement getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(WebElement phone_number) {
		this.phone_number = phone_number;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getAddresse() {
		return addresse;
	}

	public void setAddresse(WebElement addresse) {
		this.addresse = addresse;
	}
	
	public WebElement getRegionRegisterPage() {
		return regionRegisterPage;
	}

	public void setRegionRegisterPage(WebElement regionRegisterPage) {
		this.regionRegisterPage = regionRegisterPage;
	}

	public WebElement getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(WebElement postal_code) {
		this.postal_code = postal_code;
	}
	
	public WebElement getI_agree_checkbox() {
		return i_agree;
	}

	public void setI_agree_checkbox(WebElement i_agree) {
		this.i_agree = i_agree;
	}

	public WebElement getRegistre_btn() {
		return registre_btn;
	}

	public void setRegistre_btn(WebElement registre_btn) {
		this.registre_btn = registre_btn;
	}



}
