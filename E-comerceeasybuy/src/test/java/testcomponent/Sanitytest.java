package testcomponent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basecomponent.BaseClass;
import listener.ItestListner;
import listener.RetryAnalyzer;
import pagecomponent.Bottompage;
import pagecomponent.Checkoutpage;
import pagecomponent.Loginpage;
import pagecomponent.NavigationMenu;
import pagecomponent.Searchproduct;
import pagecomponent.Searchproductbydepartment;
import pagecomponent.Signup;

@Listeners(ItestListner.class)

public class Sanitytest extends BaseClass{

	
	public Signup obj;
	
	public Loginpage obj2;
	
	public NavigationMenu obj3;
	
	
	public Bottompage obj4;
	
	public Searchproduct obj5;
	
	public Searchproductbydepartment obj6;
	
	public Checkoutpage obj7;
	@Test(priority=1,retryAnalyzer=RetryAnalyzer.class,groups="smoke")
	public void createaccountexistingmaild() throws Exception {
		
	 obj=new Signup();
	 test=Reports.createTest("createaccountvaliddetails");
	obj.createaccountwithexistingmail();
		
	}
	@Test(priority=2,retryAnalyzer=RetryAnalyzer.class,groups="smoke")
	public void login() throws Exception {
		
	 obj2=new Loginpage();
	 test=Reports.createTest("login");
   obj2.login();
	}
	
	
	@Test(priority=3,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void navigation()  {
		
	 obj3=new NavigationMenu();
	 test=Reports.createTest("NavigationMenu");
	 obj3.navigationtopdeal();
	 obj3.navigationCreditCards();
	 obj3.giftideas();
	
  
	}
	
	
	@Test(priority=4,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void menunavigation()  {
		
	 obj3=new NavigationMenu();
	 test=Reports.createTest("menunavigation");
	 obj3.menunavigation();
	
  
	}
	
	@Test(priority=5,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void Bottompage()  {
		
	 obj4=new Bottompage();
	 test=Reports.createTest("Bottompage");
	obj4.bottomnavigationmanageappointment();
	obj4.bottomnavigationmenberoffers();
	obj4.bottomnavigationtradeprogram();
	
  
	}
	
	@Test(priority=6,retryAnalyzer=RetryAnalyzer.class,groups="sanity")
	public void Searchproduct()  {
		
	 obj5=new Searchproduct();
	 test=Reports.createTest("Searchproduct");
	
	obj5.searchproductvalid();
  
	}
	
	
	@Test(priority=7,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void invalidSearchproduct()  {
		
	 obj5=new Searchproduct();
	 test=Reports.createTest("Searchproductinvalid");
	obj5.searchproductinvalid();
	
  
	}

	
	@Test(priority=8,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void Searchproductbydepartment()  {
		
	 obj6=new Searchproductbydepartment();
	 test=Reports.createTest("Searchproductbydepartment");
	obj6.searchbydepartment();
	
  
	}
	
	
	
	@Test(priority=8,retryAnalyzer=RetryAnalyzer.class,groups="regression")
	public void Searchproductbybrand()  {
		
	 obj6=new Searchproductbydepartment();
	 test=Reports.createTest("Searchproductbybrand");
	obj6.searchbybrand();
  
	}
	
	@Test(priority=8,retryAnalyzer=RetryAnalyzer.class,groups="sanity")
	public void checkoutpage()  {
	obj6=new Searchproductbydepartment();
	obj7=new Checkoutpage();
	
	
	 
	test=Reports.createTest("checkoutpage");
	
	obj7.checkoutnewcustomer();
	
	
	}
	
	
	
	
	
	
	
}
