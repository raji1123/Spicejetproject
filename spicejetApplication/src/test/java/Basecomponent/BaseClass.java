package Basecomponent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utilityfile.Fileutilspicejet;

public class BaseClass extends Fileutilspicejet{
	
	
	@BeforeMethod
	public  void setup() throws Exception {
		
		browser("chrome",option());
		implicitwait(3);
		getbaseurl(propertyfile("baseurl"));
		
		
	}
	

	@BeforeTest
	public void reportstart(){
		reports();
		
	}
	
	
	
	@AfterTest
	
	public void reportend() {
		reportstop();
		
	}
	
	@AfterMethod
	public  void finish() {
		
		
		quit();
		
	}
	
	
}
