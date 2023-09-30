package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Searchproduct extends BaseClass{

	
public Searchproduct()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//input[@id='gh-search-input']")
WebElement searchmobile;



@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
WebElement addtocart;


@FindBy(xpath="//button[normalize-space()='Add to Cart']")
WebElement addtocartbrand;



@FindBy(xpath="//button[normalize-space()='Continue shopping']")
WebElement continueshopping;



@FindBy(xpath="//p[contains(text(),'Try a different search term or check out some of o')]")
WebElement verifyerrormsg;


public void searchproductvalid()  {

	
	
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
    
  
	
boolean actual1=continueshopping.isDisplayed();
	Assert.assertTrue(actual1);
	
}

public void searchproductinvalid()  {

	
	String Expected="Try a different search term or check out some of our suggestions below.";
	javascript(searchmobile);
	
	
	sendvaluetext(searchmobile,propertyfile("searchinvalid"));
	keys();
	
	
	
	
	
    
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
	
   String actual=verifyerrormsg.getText();

   Assert.assertEquals(actual, Expected);
	
	
	
}
}
