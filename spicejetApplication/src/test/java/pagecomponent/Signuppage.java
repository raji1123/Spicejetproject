package pagecomponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basecomponent.BaseClass;

public class Signuppage extends BaseClass{

	
public Signuppage()  {
		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Signup")
	WebElement Signup;


	@FindBy(xpath="//*[@class='form-control form-select ']")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	
	@FindBy(xpath="//*[@class='form-control form-select']")
	WebElement country;
	
	
	@FindBy(xpath="//*[@class='react-datepicker__input-container']")
	WebElement calender;
	
	@FindBy(xpath="//*[@class='react-datepicker__month-select']")
	WebElement month;
	
	
	@FindBy(xpath="//*[@class='react-datepicker__year-select']")
	WebElement year;
	
	
	@FindBy(xpath="//*[@class='react-datepicker__week']//*")
	List<WebElement> date;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confrmpassword;
	
	
	

	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement checkbox;
	

	@FindBy(xpath="//*[text()='Submit']")
	WebElement submit;
	
	
	@FindBy(xpath="//p[@class='font-14 mb-2']")
	WebElement Actual;
	
	
	@FindBy(xpath="//body/div[@id='react-root']/div/div/div[@class='container']/div[@class='box-full']/div[@class='row']/div[@class='register-form col-12 col-xl-7 col-lg-8']/div[1]/div[1]/div[1]")
	WebElement Actual2;
	

	@FindBy(xpath="//div[contains(text(),'Member account exists with given email ID')]")
	WebElement Actual3;
	
	
	public void signuppagevalidcredentials() throws InterruptedException {
		
		
		String Expected="Please enter the One Time Password (OTP) that has been sent to your registered mobile number";
		
		{
			eleclick(Signup,4);
			
			
			Set<String> handle=getwindowhandles() ;
			List<String> list = new ArrayList<String>(handle);
			String parent = list.get(0);
			String child = list.get(1);
			swtichwindow(child);
			select(title, "Mrs");
			
			
			
			
		    javascript(firstname);
		    explicitwait(firstname,10);
			sendvaluetext(firstname,propertyfile("firstname"));
			
			
			javascript(lastname);
			explicitwait(lastname,10);
			sendvaluetext(lastname,propertyfile("lastname"));
			
			select(country, "Fiji");
			eleclick(calender,3);
			select(month, propertyfile("month"));
			select(year, propertyfile("year"));
			select( propertyfile("date"),date);
			
			javascript(mobile);
			explicitwait(mobile,10);
			sendvaluetext(mobile,propertyfile("mobile"));
			
			javascript(email);
			explicitwait(email,10);
			sendvaluetext(email,propertyfile("email"));
			
			
			javascript(password);
			explicitwait(password,10);
			sendvaluetext(password,propertyfile("password"));

			
			javascript(confrmpassword);
			explicitwait(confrmpassword,10);
			
			sendvaluetext(confrmpassword,propertyfile("confrmpassword"));
			
			
			javascriptclick(checkbox);
			javascript(submit);
			explicitwait(10,submit);
			javascriptclick(submit);
			

			javascript(Actual);
			String actual=webpagegettitle(Actual);
			
			explicitwait(Actual,10);
			Assert.assertEquals(actual, Expected);
			Thread.sleep(5000);
			
			

			System.out.println(actual);
			
		
		}
		
		
		
		
	}
	
	
	
   public void signupmissingdetails() throws Exception {
		
		
		String Expected="SpiceClub - The frequent flyer program of SpiceJet";
		
	   
	   
		{
			eleclick(Signup,4);
			
			
			Set<String> handle=getwindowhandles() ;
			List<String> list = new ArrayList<String>(handle);
			String parent = list.get(0);
			String child = list.get(1);
			swtichwindow(child);
			select(title, "Mrs");
			
			
			
			
		    javascript(firstname);
		    explicitwait(firstname,10);
			sendvaluetext(firstname,propertyfile("firstname"));
			
			
			javascript(lastname);
			explicitwait(lastname,10);
			sendvaluetext(lastname,propertyfile("lastname"));
			
			select(country, "Fiji");
			eleclick(calender,3);
			select(month, propertyfile("month"));
			select(year, propertyfile("year"));
			select( propertyfile("date"),date);
			
			javascript(mobile);
			explicitwait(mobile,10);
			sendvaluetext(mobile,propertyfile("mobile"));
			
			javascript(email);
			explicitwait(email,10);
			sendvaluetext(email,propertyfile("email"));
			
			
			javascript(password);
			explicitwait(password,10);
			sendvaluetext(password,propertyfile("password"));

			
			
			javascriptclick(checkbox);
			javascript(submit);
			explicitwait(10,submit);
			javascriptclick(submit);
			

			
			String actual=driver.getTitle();
		
			
			System.out.println(actual);
			Assert.assertEquals(actual, Expected);
			
			Thread.sleep(5000);
			
			
			
			
		}
		
		
		
		
	}
	
   public void existingdetailssignup() throws Exception {
		
		
		String Expected="Member account exists with given email ID";
		
	   
	   
		{
			eleclick(Signup,4);
			
			
			Set<String> handle=getwindowhandles() ;
			List<String> list = new ArrayList<String>(handle);
			String parent = list.get(0);
			String child = list.get(1);
			swtichwindow(child);
			select(title, "Mrs");
			
			
			
			
		    javascript(firstname);
		    explicitwait(firstname,10);
			sendvaluetext(firstname,propertyfile("firstname"));
			
			
			javascript(lastname);
			explicitwait(lastname,10);
			sendvaluetext(lastname,propertyfile("lastname"));
			
			select(country, "Fiji");
			eleclick(calender,3);
			select(month, propertyfile("month"));
			select(year, propertyfile("year"));
			select( propertyfile("date"),date);
			
			javascript(mobile);
			explicitwait(mobile,10);
			sendvaluetext(mobile,propertyfile("mobile"));
			
			javascript(email);
			explicitwait(email,10);
			sendvaluetext(email,propertyfile("existingemail"));
			
			
			javascript(password);
			explicitwait(password,10);
			sendvaluetext(password,propertyfile("password"));

			javascript(confrmpassword);
			explicitwait(confrmpassword,10);
			
			sendvaluetext(confrmpassword,propertyfile("confrmpassword"));
			
			javascriptclick(checkbox);
			javascript(submit);
			explicitwait(10,submit);
			javascriptclick(submit);
			

			javascript(Actual3);
			String actual=Actual3.getText();
		
			explicitwait(Actual3,10);
			
			Assert.assertEquals(actual, Expected);
			
		
			System.out.println(actual);
		}
		
		
		
		
	}
}
