package testcompenet;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Basecomponent.BaseClass;
import listener.Itestlistener;
import listener.RetryAnalayzer;
import pagecomponent.BookingPage;
import pagecomponent.Loginpage;
import pagecomponent.SearchFlights;
import pagecomponent.Signuppage;


@Listeners(Itestlistener.class)
public class Sanitytestsignup extends BaseClass{

	
	public Signuppage obj;
	public Loginpage obj2;
	public SearchFlights obj3;
	public BookingPage obj4;
	
	
	
	@Test(priority=1,retryAnalyzer=RetryAnalayzer.class)
	public void validsignup() throws Exception {
		
	 obj=new Signuppage();
	 test=Reports.createTest("signupvaliddtails");
	 obj.signuppagevalidcredentials();
		
	}
	@Test(priority=2,retryAnalyzer=RetryAnalayzer.class)
	
	public void missingdetailsignup() throws Exception {
		
		obj=new Signuppage();
		test=Reports.createTest("missingdetails");
		 obj.signupmissingdetails();
			
		}
  @Test(priority=3,retryAnalyzer=RetryAnalayzer.class)
	
	public void existingdetails() throws Exception {
		
		obj=new Signuppage();
		test=Reports.createTest("existing details");
		 obj.existingdetailssignup();
			
		}
  
  @Test
  public void mobilelogin() {
	  
	  
      obj2=new Loginpage();
      test=Reports.createTest("loginwithmobile");
	  obj2.validloginmobile();
	  
  }
  
  
  
  @Test
  public void invalidmobiledtailslogin() {
	  
	  
      obj2=new Loginpage();
      test=Reports.createTest("invalidmobiledtailslogin");
	
  obj2.invaliddetailsloginmobile();
  
  
  }
  
  
  @Test
  public void onewayflightsearch() {
	  
	  
      obj3=new SearchFlights();
      test=Reports.createTest("onewayflightsearch");
	  obj3.onewayflightsearch();
  
  
  
  }
  
  
  @Test
  public void roundtripflightsearch() {
	  
	  
      obj3=new SearchFlights();
      test=Reports.createTest("roundflightsearch");
	 obj3.Roundtripflightsearch();
  
  
  
  }
  
  @Test(dependsOnMethods={"roundtripflightsearch"},retryAnalyzer=RetryAnalayzer.class)
public void flightbookingpage() throws Exception {
	  
	  obj3=new SearchFlights();
      obj4=new BookingPage();
      test=Reports.createTest("Bookingpage");
      
	   obj3.Roundtripflightsearch();
	   obj4.bookingflight();
	   
  
  
  
  }
  
  @Test(retryAnalyzer=RetryAnalayzer.class,dependsOnMethods={"flightbookingpage"})
  public void flightbookingpagecontactinfo() throws Exception {
  	  
  	  obj3=new SearchFlights();
      obj4=new BookingPage();
       test=Reports.createTest("flightbookingpagecontactinfo");
        
  	   obj3.Roundtripflightsearch();
  	   obj4.bookingflight();
  	   obj4.contactinformation();
    
    
    
    }
    
	
	
}
