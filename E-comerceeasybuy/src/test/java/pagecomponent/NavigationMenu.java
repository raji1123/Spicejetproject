package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basecomponent.BaseClass;

public class NavigationMenu extends BaseClass{

	
public NavigationMenu()  {
		
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="(//*[text()='Top Deals'])[1]")
WebElement topdeal;


@FindBy(xpath="(//*[text()='Credit Cards'])[1]")
WebElement CreditCards;


@FindBy(xpath="//div[@class='flyout-button-wrapper utility-nav-drawer utility-nav-more-drawer']")
WebElement more;


@FindBy(xpath="//ul[@class='utility-nav-drawer-flyout-list']//li[2]")
WebElement giftideas;



@FindBy(xpath="(//*[text()='Menu'])[1]")
WebElement Menu;


@FindBy(xpath="//ul[@class='hamburger-menu-flyout-list']/li[1]")
WebElement Deals;


@FindBy(xpath="(//a[@data-lid='ubr_dls_bbo'])[1]")
WebElement outlet;





public void navigationtopdeal()  {

	String Expected="Top Deals and Featured Offers on Electronics - Best Buy";
	
	javascript(topdeal);
	eleclick(topdeal,10);
	
    String actual=driver.getTitle();
	

	Assert.assertEquals(actual, Expected);
	
	
}


public void navigationCreditCards()  {
String Expected="Best Buy Credit Card: Rewards & Financing";
	
	javascript(CreditCards);
	eleclick(CreditCards,10);
	
    String actual=driver.getTitle();
	

	Assert.assertEquals(actual, Expected);
	
	
}

public void giftideas()  {

	
String Expected="Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
	
	javascript(more);
	eleclick(more,10);
	
	javascript(giftideas);
	eleclick(giftideas,10);
	
    String actual=driver.getTitle();

	Assert.assertEquals(actual, Expected);
	
	
}


public void menunavigation()  {
String Expected="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
	
	javascript(Menu);
	eleclick(Menu,10);
	
	
	javascript(Deals);
	eleclick(Deals,10);
	
	javascript(outlet);
	eleclick(outlet,10);
	
    String actual=driver.getTitle();
	

	Assert.assertEquals(actual, Expected);
	
	
}




}