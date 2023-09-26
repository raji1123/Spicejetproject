package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Basecomponent.BaseClass;

public class SearchFlights extends BaseClass{

public SearchFlights()  {
		
		
		PageFactory.initElements(driver, this);
	}



@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[2]")
WebElement radiobuttonroundtrip;


@FindBy(xpath="//div[@data-testid='to-testID-origin']//input[@type='text']")
WebElement originclick;


@FindBy(xpath="//div[@data-testid='to-testID-destination']//input[@type='text']")
WebElement destinationclick;


@FindBy(xpath="//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//*")
List<WebElement> from;

@FindBy(xpath="//*[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//*")
List<WebElement> to;


@FindBy(xpath="(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//*)")
List<WebElement> calender;


@FindBy(xpath="//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")
WebElement passenger;


@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
WebElement adultplusbutton;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")
WebElement childrenplusbutton;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[3]")
WebElement infantplusbutton;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim'])[1]")
WebElement normalclick;

@FindBy(xpath="//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']")
List<WebElement> currency;



@FindBy(xpath="(//div[@class='css-1dbjc4n'])[66]")
WebElement familyfriends;


@FindBy(xpath="(//div[@class='css-1dbjc4n'])[68]")
WebElement senoiorcitizen;

@FindBy(xpath="(//div[@class='css-1dbjc4n'])[70]")
WebElement minor;


@FindBy(xpath="(//div[@class='css-1dbjc4n'])[72]")
WebElement student;

@FindBy(xpath="(//div[@class='css-1dbjc4n'])[74]")
WebElement armedforce;



@FindBy(xpath="(//div[@class='css-1dbjc4n'])[76]")
WebElement govtemployee;



@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
WebElement searchflight;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9'])")
WebElement studenttermsandcondition;

@FindBy(xpath="//div[@class='css-1dbjc4n r-zso239'])")
WebElement familyfriendstermsandcondition;



@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[6]")
WebElement seniorcitizentermsandccondition;




@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
WebElement continuele;


@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79 r-15d164r r-38x2cy']")
WebElement Actualresultoneway;

@FindBy(xpath="//div[@id='list-results-section-0']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-7e3msg']//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz']//div[1]")
WebElement Actualresultroundtrip;














public void onewayflightsearch() {
	
	String Expected="Unfortunately, there are no flights available for the Students fare.";
	
	
	eleclick(originclick,10);
	

	select("Mumbai",from);
	
	eleclick(destinationclick,10);
	
	select("Coimbatore",to);
	
	
	
	select("26",calender);
	
	javascript(passenger);
	eleclick(passenger,10);
	

	javascript(adultplusbutton);
	eleclick(adultplusbutton,10);
	
	eleclick (normalclick,10);
	
	
	select("INR",currency);

	eleclick (student,10);
	
	eleclick (searchflight,10);
	
	javascript(studenttermsandcondition);
	eleclick (studenttermsandcondition,10);
	
	eleclick (continuele,10);
	
	
	javascript(Actualresultoneway);
    String actual=Actualresultoneway.getText();



   Assert.assertEquals(actual, Expected);



}

public void Roundtripflightsearch() {
	
	
	String Expected="Select your Departure to Chennai";
	
	eleclick(radiobuttonroundtrip,10);
	
	eleclick(originclick,10);
	

	select("Mumbai",from);
	
	eleclick(destinationclick,10);
	
	select("Chennai",to);
	
	
	
	select("27",calender);
	
	select("30",calender);
	javascript(passenger);
	eleclick(passenger,10);
	

	javascript(adultplusbutton);
	eleclick(adultplusbutton,10);
	
	eleclick (normalclick,10);
	
	
	select("INR",currency);

	//eleclick (senoiorcitizen,10);
	
	eleclick (searchflight,10);
	
	//javascript(seniorcitizentermsandccondition);
	//eleclick (seniorcitizentermsandccondition,10);
	
	eleclick (continuele,10);
	
	
	javascript(Actualresultroundtrip);
    String actual=Actualresultroundtrip.getText();



   Assert.assertEquals(actual, Expected);



}



}
