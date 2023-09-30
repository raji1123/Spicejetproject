package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Checkoutpage extends BaseClass{

	
public Checkoutpage()  {
		
		
		PageFactory.initElements(driver, this);
	}



@FindBy(xpath="(//*[text()='Menu'])[1]")
WebElement Menu;


@FindBy(xpath="//ul[@class='hamburger-menu-flyout-list']//li")
List<WebElement >list;


@FindBy(xpath="(//div[@class='flex-copy-wrapper'])[1]")
WebElement link;



@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[2]")
WebElement Addtocart;



@FindBy(xpath="//a[normalize-space()='Go to Cart']")
WebElement Gotocart;


@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
WebElement adsclose;


@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
WebElement Checkout;

@FindBy(xpath="(//button[@aria-label='Close'])[1]")
WebElement close;




@FindBy(xpath="//*[text()='Continue as Guest']")
WebElement guest;




//customer details

@FindBy(xpath="//input[@id='firstName']")
WebElement firstName;


@FindBy(xpath="//input[@id='lastName']")
WebElement lastName;


@FindBy(xpath="//input[@class='tb-input  autocomplete__input']")
WebElement Adress;


@FindBy(xpath="//input[@id='city']")
WebElement city;





@FindBy(xpath="//input[@id='zipcode']")
WebElement zipcode;

@FindBy(xpath="//*[@class='tb-select-wrapper form-control c-dropdown das-select-dropdown ']")
WebElement selectlist1;

@FindBy(xpath="//select[@id='state']//*")
List<WebElement >selectlist2;



@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
WebElement apply;


@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
WebElement errormsg;




//existing customer
@FindBy(xpath="//input[@id='gh-search-input']")
WebElement searchmobile;



@FindBy(xpath="//input[@id='fld-e']")
WebElement emaillogin;



@FindBy(xpath="//input[@id='fld-p1']")
WebElement passwordlogin;


@FindBy(xpath="//button[@type='submit']")
WebElement button;

@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
WebElement alertmsg;

@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[2]")
WebElement addtocart;
public void checkoutnewcustomer() {
	String Expected="Request failed because of network connection";
	
javascript(Menu);
	
	eleclick(Menu,10);
	
	
	
	select("Appliances",list);
	select("Major Kitchen Appliances",list);
	
	select("Refrigerators",list);
	
	
	 javascript(link);
	eleclick(link,10);
	
	
	 javascript(Addtocart);
		
	eleclick(Addtocart,10);
	
	
    
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
    eleclick(Gotocart,10);
    
    eleclick(adsclose,10);
    
    javascript(Checkout);
    eleclick(Checkout,10);
    
    
    javascript(guest);
    eleclick(guest,10);
    
  

	sendvaluetext(firstName,propertyfile("firstName"));
	sendvaluetext(lastName,propertyfile("lastName"));
	
	sendvaluetext(Adress,propertyfile("Adress"));
	
	sendvaluetext(zipcode,propertyfile("zipcode"));
	sendvaluetext(city,propertyfile("city"));
	
	
	select("OK",selectlist2);
    
	
	sendvaluetext(zipcode,propertyfile("zipcode"));
	eleclick(apply,10);


	String actual=errormsg.getText();
	
	Assert.assertEquals(actual, Expected);
	

}




public void checkoutexistingcustomer() {
	
	String Expected="Sorry, something went wrong. Please try again.";
javascript(searchmobile);
	
	
	sendvaluetext(searchmobile,propertyfile("searchmobile"));
	keys();
	
	
	javascript(addtocart);
	
	eleclick(addtocart,10);
	
	 
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
    eleclick(Gotocart,10);
    
    
    
    javascript(Checkout);
    eleclick(Checkout,10);
    
    
   
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
    
    javascript(emaillogin);
    sendvaluetext(emaillogin,propertyfile("emaillogin"));
    
    javascript(passwordlogin);
    
    sendvaluetext(passwordlogin,propertyfile("passwordlogin"));
    
    
    eleclick(button,10);
    String actual=alertmsg.getText();
	
	
	
	
	System.out.println(actual);
	
	Assert.assertEquals(actual, Expected);
	
}





}