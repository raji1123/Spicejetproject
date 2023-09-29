package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Basecomponent.BaseClass;

public class Flightstatus extends BaseClass{

	
public Flightstatus()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//*[text()='flight status']")
WebElement checkin;


@FindBy(xpath="//div[@class='css-1dbjc4n r-15d164r r-136ojw6']")
WebElement departuredate;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-b5h31w r-1qxgc49 r-1otgn73'])[2]")
WebElement dateslect;

@FindBy(xpath="(//input[@type='text'])[1]")
WebElement from;

@FindBy(xpath="(//input[@type='text'])[2]")
WebElement to;

@FindBy(xpath="//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//*")
List<WebElement> country;


@FindBy(xpath="//div[@class='css-1dbjc4n r-11u4nky r-z2wwpe r-rs99b7 r-8oi148 r-1mi0q7o r-ymttw5 r-k5i03q']")
WebElement flightnumber;

@FindBy(xpath="(//div[contains(text(),'Search Flights')])[1]")
WebElement searchflight;

@FindBy(xpath="//div[@class='css-76zvg2 r-qsz3a2 r-2t9rge r-1kfrs79']")
WebElement Actualresult;


public void flightstatus() {
	
	String Expected="Sorry, there are no flights available";
	eleclick(checkin,10);
	
	eleclick(departuredate,10);
	
	eleclick(departuredate,10);
	eleclick(dateslect,10);
	
     eleclick(from,10);

	select("Mumbai",country);
	
	eleclick(to,10);
	
	select("Coimbatore",country);
	
	
	
	
	mouseaction(searchflight);
	
	String Actual=Actualresult.getText();
	
	
	Assert.assertEquals(Actual, Expected);
}

}
