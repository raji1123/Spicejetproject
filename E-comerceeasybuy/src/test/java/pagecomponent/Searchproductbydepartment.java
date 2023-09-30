package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Searchproductbydepartment extends BaseClass{

	
public Searchproductbydepartment()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="(//*[text()='Menu'])[1]")
WebElement Menu;

@FindBy(xpath="//ul[@class='hamburger-menu-flyout-list']//li")
List<WebElement >list;


@FindBy(xpath="(//div[@class='flex-copy-wrapper'])[1]")
WebElement link;


@FindBy(linkText="Windows 11 laptops.")
WebElement windowslink;



@FindBy(xpath="//a[contains(text(),'HP - 15.6\" Touch-Screen Laptop - Intel Core i3 - 8')]")
WebElement windowslink2;


@FindBy(xpath="(//button[@type='button'][normalize-space()='Add to Cart'])[2]")
WebElement Addtocart;




@FindBy(xpath="//a[normalize-space()='Sony cameras']")
WebElement sonycameralink;

@FindBy(xpath="//span[@class='added-to-cart']")
WebElement verify2;


public void searchbydepartment()  {

String	Expected="Added to cart";
	
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
    
  
	
String actual=verify2.getText();

Assert.assertEquals(actual, Expected);

	
}


public void searchbybrand()  {

String	Expected="Added to cart";
	
	javascript(Menu);
	
	eleclick(Menu,10);
	
	
	
	select("Brands",list);
	select("Sony",list);
	
	
	
	javascript(sonycameralink);
	eleclick(sonycameralink,10);
	
	
	
	
	 
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    

	
    
    
	
	javascript(Addtocart);
		
	eleclick(Addtocart,10);
	
	
    
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
  
	
String actual=verify2.getText();

Assert.assertEquals(actual, Expected);

	
}



}
