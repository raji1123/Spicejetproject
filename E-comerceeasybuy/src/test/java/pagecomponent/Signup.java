package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Signup extends BaseClass{
public Signup()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//*[text()='Create Account']")
WebElement createaccount;





@FindBy(xpath="(//*[text()='Account'])[1]")
WebElement Accountlist;

@FindBy(xpath="//input[@id='firstName']")
WebElement firstName;


@FindBy(xpath="//input[@id='lastName']")
WebElement lastName;


@FindBy(xpath="//input[@id='email']")
WebElement email;


@FindBy(xpath="//input[@id='fld-p1']")
WebElement password;

@FindBy(xpath="//input[@id='reenterPassword']")
WebElement confirmpassword;

@FindBy(xpath="//input[@id='phone']")
WebElement phone;


@FindBy(xpath="//button[@type='submit']")
WebElement submit;




@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
WebElement alertmsg;

public void createaccountwithexistingmail() {
	
	
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	javascript(Accountlist);
	eleclick(Accountlist,10);
	
	
	javascript(createaccount);
	eleclick(createaccount,10);
	
	javascript(firstName);
	
	sendvaluetext(firstName,propertyfile("firstName"));
	sendvaluetext(lastName,propertyfile("lastName"));
	sendvaluetext(email, propertyfile ("email"));
	sendvaluetext(password,propertyfile("password"));
	sendvaluetext(confirmpassword,propertyfile("confirmpassword"));
	sendvaluetext(phone,propertyfile("phone"));
	
	eleclick(submit,4);
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	boolean actual=alertmsg.isDisplayed();
	
	
	
	
	
	Assert.assertTrue(actual);
}







//


	
}
