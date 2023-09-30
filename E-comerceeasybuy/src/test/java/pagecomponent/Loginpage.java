package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class Loginpage extends BaseClass{

	
public Loginpage()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="(//*[text()='Account'])[1]")
WebElement Accountlist;


@FindBy(xpath="//a[normalize-space()='Sign In']")
WebElement signin;

@FindBy(xpath="//input[@id='fld-e']")
WebElement emaillogin;

@FindBy(xpath="//input[@id='fld-p1']")
WebElement passwordlogin;


@FindBy(xpath="//button[@type='submit']")
WebElement loginsumbit;


@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
WebElement alertmsg;

public void login() {
	
	
	String Expected="Sorry, something went wrong. Please try again.";
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	javascript(Accountlist);
	eleclick(Accountlist,10);
	javascript(signin);
	eleclick(signin,10);
	
	
	sendvaluetext(emaillogin,propertyfile("emaillogin"));
	sendvaluetext(passwordlogin,propertyfile("passwordlogin"));
	
	eleclick(loginsumbit,10);
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String actual=alertmsg.getText();
	
	
	
	
	System.out.println(actual);
	
	Assert.assertEquals(actual, Expected);
	
}

}
