package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Bottompage extends BaseClass{

	
public Bottompage()  {
		
		
		PageFactory.initElements(driver, this);
	}
 
@FindBy(xpath="//a[@data-lid='ft_op_tradein_program']")
WebElement tradeprogram;

@FindBy(xpath="//a[@data-lid='ft_support_manage_appointment']")
WebElement manageappointment;


@FindBy(xpath="//a[@data-lid='ft_mby_mem']")
WebElement menberoffers;


public void bottomnavigationtradeprogram()  {

	String Expected="Best Buy Trade In Program for Computers, Cell Phones and More";
	
	javascript(tradeprogram);
	eleclick(tradeprogram,10);
	
    String actual=driver.getTitle();
	
   
	Assert.assertEquals(actual, Expected);
	
	
}
public void bottomnavigationmanageappointment()  {

	String Expected="Appointment Finder - Best Buy";
	
	javascript(manageappointment);
	eleclick(manageappointment,10);
	
    String actual=driver.getTitle();
	
    
	Assert.assertEquals(actual, Expected);
	
	
}
public void bottomnavigationmenberoffers()  {

	String Expected="My Best Buy Member Offers - Best Buy";
	
	javascript(menberoffers);
	eleclick(menberoffers,10);
	
    String actual=driver.getTitle();
	
    
	Assert.assertEquals(actual, Expected);
	
	
}



}