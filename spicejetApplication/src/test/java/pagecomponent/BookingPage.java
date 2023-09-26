package pagecomponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Basecomponent.BaseClass;

public class BookingPage extends BaseClass{
	
public BookingPage()  {
		
		
		PageFactory.initElements(driver, this);
	}

//booking page

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
WebElement continuewithpayement;


@FindBy(xpath="//div[contains(text(),'Contact Details')]")
WebElement Actualresultcontinuepayement;


//Contact details 


@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
WebElement Titlebox;


@FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1inuy60 r-1yt7n81 r-1otgn73'])[1]")
WebElement Title;


@FindBy(xpath="(//input[@type='text'])[1]")
WebElement firstname;

@FindBy(xpath="(//input[@type='text'])[2]")
WebElement lastname;


@FindBy(xpath="(//input[@type='text'])[3]")
WebElement mobile;


@FindBy(xpath="(//input[@type='text'])[4]")
WebElement email;


@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu'])[1]")
WebElement countryclick;


@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1loqt21 r-1otgn73 r-lrvibr'])")
List<WebElement> country ;


@FindBy(xpath="(//input[@type='text'])[5]")
WebElement city;



@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[3]")
WebElement checkbox;


public void bookingflight() throws InterruptedException {
	
	//String Expected="https://www.spicejet.com/booking";
	
	javascript(continuewithpayement);
	eleclick(continuewithpayement,10);
	
	Thread.sleep(3000);
	//String Actual=driver.getCurrentUrl();
	//Assert.assertEquals(Actual, Expected);
	
}

public void contactinformation()
{
	
	String Expected="https://www.spicejet.com/booking";
	javascript(Titlebox);
	eleclick(Titlebox,10);
	eleclick(Title,10);
	javascript(firstname);
	sendvaluetext(firstname,propertyfile("firstname"));
	javascript(lastname);
	sendvaluetext(lastname,propertyfile("lastname"));
	
	
	javascript(mobile);
	sendvaluetext(mobile,propertyfile("mobile"));
	
	
	javascript(email);
	sendvaluetext(email,propertyfile("email"));
	
	select("India",country);
	javascript(city);
	
	sendvaluetext(city,propertyfile("city"));
	eleclick(checkbox,10);
	
	
	String Actual=driver.getCurrentUrl();
	Assert.assertEquals(Actual, Expected);

}
}
