package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Basecomponent.BaseClass;

public class Statusandcheckin extends BaseClass{

	
public Statusandcheckin()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//*[text()='check-in']")
WebElement checkin;

@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
WebElement ticketnumber;

@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com']")
WebElement email;

@FindBy(xpath="//div[contains(text(),'Search Booking')]")

WebElement search;


@FindBy(xpath="(//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e'])[1]")
WebElement ticketerrormsg;



@FindBy(xpath="//div[normalize-space()='Invalid Email']")
WebElement emailerrormsg;



public void checkin() {
	
	String Expected="Invalid PNR or Ticket Number";
	eleclick(checkin,4);
	javascript(ticketnumber);
	
	sendvaluetext(ticketnumber,propertyfile("ticketnumber"));
	
    javascript(email);
	
	sendvaluetext(email,propertyfile("email"));
	
	
	
	javascript(search);
		
	mouseaction(search);
	

	
	
	
	javascript(ticketerrormsg);
	
	String actual=ticketerrormsg.getText();
	Assert.assertEquals(actual, Expected);
	
	
	
	
}




public void missingdetailscheckin() {
	
	String Expected="Invalid Email";
	
	eleclick(checkin,4);
	mouseaction(search);
	javascript(emailerrormsg);
	
	String actual=emailerrormsg.getText();
	Assert.assertEquals(actual, Expected);
	
	
	
	
}








}
