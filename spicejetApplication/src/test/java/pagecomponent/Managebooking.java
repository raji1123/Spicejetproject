package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Basecomponent.BaseClass;

public class Managebooking extends BaseClass{

	
	
public Managebooking()  {
		
		
		PageFactory.initElements(driver, this);
	}
	


@FindBy(xpath="//*[text()='manage booking']")
WebElement managebooking;


@FindBy(xpath="//*[text()='Add Your Itinerary]")
WebElement AddYourItinerary;
	

@FindBy(xpath="//*[text()='ViewChangeAssist'")
WebElement ViewChangeAssist;
	



@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
WebElement ticketnumber;

@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com / Doe']")
WebElement email;

@FindBy(xpath="//div[contains(text(),'Search Booking')]")

WebElement search;



@FindBy(xpath="(//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e'])[1]")
WebElement emailerrormsg;


public void managebooking() {
	
	String Expected="Invalid PNR or Ticket Number";
	eleclick(managebooking,4);
	javascript(ticketnumber);
	
	sendvaluetext(ticketnumber,propertyfile("ticketnumber"));
	
    javascript(email);
	
	sendvaluetext(email,propertyfile("email"));
	
	
	
	javascript(search);
		
	mouseaction(search);
	

	
	
	javascript(emailerrormsg);
	
	String actual=emailerrormsg.getText();
	Assert.assertEquals(actual, Expected);
	
	
	
	
}






}
