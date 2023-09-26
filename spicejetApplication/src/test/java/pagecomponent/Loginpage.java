package pagecomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basecomponent.BaseClass;

public class Loginpage extends BaseClass{

	

public Loginpage()  {
		
		
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="(//*[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
WebElement login;


@FindBy(xpath="((//*[@class='css-1dbjc4n r-zso239'])[4]")
WebElement radiobuttonemail;


@FindBy(xpath="(//*[@class='css-1dbjc4n r-zso239'])[3]")
WebElement radiobuttonmobile;


@FindBy(xpath="//*[@type='email']")
WebElement email;


@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
WebElement mobile;



@FindBy(xpath="//*[@type='password']")
WebElement password;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
WebElement click;


@FindBy(xpath="//div[@class='css-1dbjc4n r-1jkjb']")
WebElement Actual_mobile;


@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-2t9rge r-1enofrn r-1bymd8e']")
WebElement Actual_invalidmobile;



public void validloginmobile() {
	
	String Expected="Hi cddddd";
	eleclick(login,4);
	javascript(radiobuttonmobile);
	eleclick(radiobuttonmobile,4);
	sendvaluetext(mobile,propertyfile("loginmobile"));
	
	sendvaluetext(password,propertyfile("loginmobilepassword"));
	
	eleclick(click,4);
	
	javascript(Actual_mobile);
	explicitwait(Actual_mobile,10);
	String actual=webpagegettitle( Actual_mobile);
}


public void invaliddetailsloginmobile() {
	
	String Expected="Please enter a valid mobile number";
	eleclick(login,4);
	javascript(radiobuttonmobile);
	eleclick(radiobuttonmobile,4);
	sendvaluetext(mobile,propertyfile("invalidloginmobile"));
	
	sendvaluetext(password,propertyfile("firstname"));
	
	
	
	eleclick(click,4);
	
	javascript( Actual_invalidmobile);
	explicitwait( Actual_invalidmobile,10);
	String actual=webpagegettitle(Actual_invalidmobile);
}





}
