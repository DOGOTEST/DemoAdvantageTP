
package com.advantageonlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingPO extends PageObject{

	public ShoppingPO (WebDriver driver) {
		super(driver);
		
	}
	//Commander 5 articles
	static int var = 5;
	//Accès my ORDERS
	@FindBy(css = "body.ng-scope:nth-child(5) ul.roboto-light.desktop-handler li:nth-child(3) a.img div.mini-title:nth-child(3) > label.option.ng-scope:nth-child(2)")
	 //@FindBy(xpath = "//header/nav[1]/ul[1]/li[3]/a[1]/div[1]/label[2]")  
     WebElement my_orders_box ; 
    
    //Bouton remove (supprimer)
	@FindBy(linkText = "REMOVE") 
    WebElement remove_btn ;
	
	// @FindBy(xpath = "//tbody/tr[2]/td[7]/span[1]/a[1]']")////tbody/tr[2]/td[7]/span[1]/a[1]
    // @FindBy(xpath = "//div[@id='myAccountContainer']/div/table/tbody/tr[3]/td[7]/span/a")
    
    //Bouton Yes CANCEL
    @FindBy(xpath = "//button[@id='confBtn_1']/label") 
    WebElement cancel_btn ;
    
    //Bouton ajouter au panier
    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]") //save_to_cart
    WebElement add_to_cart_btn ;
    
    //Changer de couleur
    @FindBy(xpath = "/html[1]/body[1]/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]") 
    //@FindBy(css = "#bunny[last()]")
    WebElement couleur_box ;
    
  
    
    //Bouton modifier
    @FindBy(xpath = "//a[contains(text(),'EDIT')]") 
    WebElement edit_btn ;
    
    //SOURIS
    @FindBy(xpath = "//div[@id='miceImg']") 
    WebElement mice_Img ;
    
    //Tablettes
    @FindBy(xpath = "//div[@id='tabletsImg']") 
    WebElement tablets_Img ;
    
    //Speakers
    @FindBy(xpath = "//div[@id='speakersImg']") 
    WebElement speakers_Img ;
    
    //Ordinateur
    @FindBy(xpath = "//div[@id='laptopsImg']") 
    WebElement laptops_Img ;
    
   //Acheter
    @FindBy(xpath = "//button[contains(text(),'BUY NOW')]") 
    WebElement buy_now_btn ;
    
    //Augmenterer la quantité
    @FindBy(xpath = "//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[3]") 
    WebElement plus_btn ;
    
    //Diminiuer la quantité
    @FindBy(xpath = "//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[1]") 
    WebElement moins_btn ;
    
    //PAGE HOME
    @FindBy(xpath = "//a[contains(text(),'HOME')]") 
    WebElement home_btn ;
  
    // USER
    //@FindBy (css ="#menuUser")
    @FindBy(xpath = "//*[@id='menuUser']") 
    WebElement menuUser_btn ;
    
    // PANIER
    //@FindBy (css ="#menuCart")
    @FindBy(xpath = "//*[@id='menuCart']") 
    WebElement menuCart_btn ;
    
    //@FindBy(xpath = "//button[@id='checkOutButton']") 
    @FindBy(css = "#checkOutButton")
    WebElement checkOutButton_btn ; 
    
    //@FindBy(xpath = "//button[@id='next_btn']") 
    @FindBy(css = "#next_btn")
    WebElement next_btn ; 
    
  
    

	public WebElement getMy_orders_box() { 
		  return my_orders_box; 
	}
	  
	public void setMy_orders_box(WebElement my_orders_box) { 
		this.my_orders_box = my_orders_box; 
	}
	   
	
	public WebElement getRemove_btn() { 
		  return remove_btn; 
	}
	  
	public void setRemove_btn(WebElement remove_btn) { 
		this.remove_btn = remove_btn; 
	}
	
	public WebElement getCancel_btn() { 
		  return cancel_btn; 
	}
	  
	public void setCancel_btn(WebElement cancel_btn) { 
		this.cancel_btn = cancel_btn; 
	}
	 
	public WebElement getAdd_to_cart_btn() { 
		  return add_to_cart_btn; 
	}
	  
	public void setAdd_to_cart_btn(WebElement add_to_cart_btn) { 
		this.add_to_cart_btn = add_to_cart_btn; 
	}
	
	public WebElement getCouleur_box() { 
		  return couleur_box; 
	}
	  
	public void setCouleur_box(WebElement couleur_box) { 
		this.couleur_box = couleur_box; 
	}
	
	public WebElement getEdit_btn() { 
		  return edit_btn; 
	}
	  
	public void setEdit_btn(WebElement edit_btn) { 
		this.edit_btn = edit_btn; 
	}
	
	public WebElement getMice_Img() { 
		  return mice_Img; 
	}
	  
	public void setMice_Img(WebElement mice_Img) { 
		this.mice_Img = mice_Img; 
	}
	
	public WebElement getTablets_Img() { 
		  return tablets_Img; 
	}
	  
	public void setTablets_Img(WebElement tablets_Img) { 
		this.tablets_Img = tablets_Img; 
	}
	
	public WebElement getSpeakers_Img() { 
		  return speakers_Img; 
	}
	  
	public void setSpeakers_Img(WebElement speakers_Img) { 
		this.speakers_Img = speakers_Img; 
	}
	
	public WebElement getLaptops_Img() { 
		  return laptops_Img; 
	}
	  
	public void setLaptops_Img(WebElement laptops_Img) { 
		this.laptops_Img = laptops_Img; 
	}
	
	public WebElement getBuy_now_btn() { 
		  return buy_now_btn; 
	}
	  
	public void setBuy_now_btn(WebElement buy_now_btn) { 
		this.buy_now_btn = buy_now_btn; 
	}
	
	public WebElement getPlus_btn() { 
		  return plus_btn; 
	}
	  
	public void setPlus_btn(WebElement plus_btn) { 
		this.plus_btn = plus_btn; 
	}
	
	public WebElement getMoins_btn() { 
		  return moins_btn; 
	}
	  
	public void setMoins_btn(WebElement moins_btn) { 
		this.moins_btn = moins_btn; 
	}
	
	public WebElement getHome_btn() { 
		  return home_btn; 
	}
	  
	public void setHome_btn(WebElement home_btn) { 
		this.home_btn = home_btn; 
	}
	
	public WebElement getMenuUser_btn() { 
		  return menuUser_btn; 
	}
	  
	public void setMenuUser_btn(WebElement menuUser_btn) { 
		this.menuUser_btn = menuUser_btn; 
	}
	
	public WebElement getMenuCart_btn() { 
		  return menuCart_btn; 
	}
	  
	public void setMenuCart_btn(WebElement menuCart_btn) { 
		this.menuCart_btn = menuCart_btn; 
	}
	
	public WebElement getCheckOutButton_btn() { 
		  return checkOutButton_btn; 
	}
	  
	public void setCheckOutButton_btn(WebElement checkOutButton_btn) { 
		this.checkOutButton_btn = checkOutButton_btn; 
	}
	
	public WebElement getNext_btn() {
		return next_btn;
	}

	public void setNext_btn(WebElement next_btn) {
		this.next_btn = next_btn;
	}	

	


}
