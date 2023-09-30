package basecomponent;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utility.Fileutilbestbuy;

public class BaseClass extends Fileutilbestbuy{

	//@Parameters("browser")
	@BeforeMethod
	
	public  void setup() throws Exception {
		
		browser("chrome");
		
	
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
