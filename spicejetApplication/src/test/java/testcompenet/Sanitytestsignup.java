package testcompenet;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Basecomponent.BaseClass;
import listener.Itestlistener;
import listener.RetryAnalayzer;
import pagecomponent.BookingPage;
import pagecomponent.Flightstatus;
import pagecomponent.Loginpage;
import pagecomponent.Managebooking;
import pagecomponent.SearchFlights;
import pagecomponent.Signuppage;
import pagecomponent.Statusandcheckin;


@Listeners(Itestlistener.class)
public class Sanitytestsignup extends BaseClass{

	
	public Signuppage obj;
	public Loginpage obj2;
	public SearchFlights obj3;
	public BookingPage obj4;
	public Statusandcheckin obj5;
	public Flightstatus obj6;
	public Managebooking obj7;
	
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
  
  @Test(priority=4,retryAnalyzer=RetryAnalayzer.class)
  public void mobilelogin() {
	  
	  
      obj2=new Loginpage();
      test=Reports.createTest("loginwithmobile");
	  obj2.validloginmobile();
	  
  }
  
  
  
  @Test(priority=5,retryAnalyzer=RetryAnalayzer.class)
  public void invalidmobiledtailslogin() {
	  
	  
      obj2=new Loginpage();
      test=Reports.createTest("invalidmobiledtailslogin");
	
  obj2.invaliddetailsloginmobile();
  
  
  }
  
  
  @Test(priority=6,retryAnalyzer=RetryAnalayzer.class)
  public void onewayflightsearch() {
	  
	  
      obj3=new SearchFlights();
      test=Reports.createTest("onewayflightsearch");
	  obj3.onewayflightsearch();
  
  
  
  }
  
  
  @Test(priority=7)
  public void roundtripflightsearch() {
	  
	  
      obj3=new SearchFlights();
      test=Reports.createTest("roundflightsearch");
	 obj3.Roundtripflightsearch();
  
  
  
  }
  
  @Test(priority=8,retryAnalyzer=RetryAnalayzer.class)
  public void Roundtripflightsearchwithtermsandcondition() {
	  
	  
      obj3=new SearchFlights();
      test=Reports.createTest("Roundtripflightsearchwithtermsandcondition");
	obj3.Roundtripflightsearchwithtermsandcondition();
  
  
  }
  
  
  @Test(priority=8,retryAnalyzer=RetryAnalayzer.class)
  public void flightbookingpagecontactinfo() throws Exception {
  	  
  	  obj3=new SearchFlights();
      obj4=new BookingPage();
       test=Reports.createTest("flightbookingpagecontactinfo");
        
  	   obj3.Roundtripflightsearch();
       
  	  
  	   obj4.bookingcontactinformation();
    
    
    
    }
  
  
  
  
  @Test(priority=9,retryAnalyzer=RetryAnalayzer.class)
  public void checkin()  {
  	  
  	  
       test=Reports.createTest("checkin");
        
  	 obj5=new Statusandcheckin();
  	 obj5.checkin();
    
    
    
    }
  
  @Test(priority=10,retryAnalyzer=RetryAnalayzer.class)
  public void missingdetailscheckin()  {
  	  
  	  
      test=Reports.createTest("missingdetailscheckin");
       
 	 obj5=new Statusandcheckin();
     obj5.missingdetailscheckin();
   
   
   
   }
	
  @Test(priority=12,retryAnalyzer=RetryAnalayzer.class)
  public void flightstatus()  {
  	  
  	  
      test=Reports.createTest("flightstatus");
       
 	 obj6=new Flightstatus();
     obj6.flightstatus();
   
   
   
   }
	
  
  
  @Test(priority=13)
  public void managebooking()  {
  	  
  	  
      test=Reports.createTest("managebooking");
       
 	 obj7=new Managebooking();
     obj7.managebooking();
   
   
   
   }
	
  
  
  
  
  
  
}
