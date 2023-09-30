package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class WebUtilbestbuy {

	

	public static WebDriver driver;
	
	public static ExtentHtmlReporter Reporter;
	public static ExtentReports Reports;
	public static ExtentTest test;
	public static Actions act;
	
	
	
	
	public static ChromeOptions option() {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		return option;
	}
	
	
	
	
public static EdgeOptions option2() {
		
		EdgeOptions option2=new EdgeOptions();
		option2.addArguments("--disable-notifications");
		
		return option2;
	}




public static ChromeOptions optionorigin() {
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins==*");
	
	return option;
}







	public static void browser(String browser) {
		
		boolean flag=false;
		switch(browser) {
		case "chrome": driver=new ChromeDriver();
		
		
		flag=true;
		break;
		case "edge": driver=new EdgeDriver();
		flag=true;
		break;
		case "firefox": driver=new FirefoxDriver();
		flag=true;
		break;
		}
		driver.manage().window().maximize();
		
	}
	
	public static void getbaseurl(String url) {

		driver.get(url);

	}
	
	public static void reports() {
		
		Reporter=new ExtentHtmlReporter(".//Extentrports//bestbuyreports"+".html");
		
		
		Reports =new ExtentReports();
		Reports.attachReporter(Reporter);
		Reporter.config().setDocumentTitle("SpicejetApplication");
		Reporter.config().setReportName("Regression report");
		Reporter.config().setTheme(Theme.DARK);
		
		
		
		
	}
	
	public static void reportstop() {
		Reports.flush();
		
	}
	
	public static void quit() {
		
		driver.quit();
	}
	
	
	public static Set<String> getwindowhandles() {
		
		
		Set<String> window = driver.getWindowHandles();
		return window;
	}
	
	
	
	public static void swtichwindow(String child) {
		driver.switchTo().window(child);
		
	}
	public static String Screenshot(String name) throws Exception {
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		
		
		 String location=System.getProperty("user.dir")+"/Screenshot/successbestbuy_"+name+datevalue() +".png";
		
		File destination =new File(location);
		
		FileHandler.copy(source, destination);
		return location;
		
		
		
	}
	
	
	public static String failedscreenshots(String name) {
		String location=null;
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
	
		location=System.getProperty("user.dir")+"/failedscreenshot/failurebestbuy_"+name+datevalue() +".png";
		File destination=new File(location);
		
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return location;
	}
	
	
	
	
	public static void select(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByVisibleText(value);
		test.log(Status.INFO, "valueselected");
		
	}
	
	
	public static void selectvalue(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
		test.log(Status.INFO, "valueselected");
		
	}
	

	public static void select(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
		test.log(Status.INFO, "indexvalueselected");
		
	}
	
	

	public static void mouseaction(WebElement ele) {
		
		act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		
	}
	
  public static void keys() {
		
		act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
  public static String datevalue() {
		String value = null;
		
		value = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		return value;
		
	}
	
	
	
	
	public static void implicitwait(int time) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	
	public static WebElement explicitwait( int time,WebElement ele) {

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement element=wt.until(ExpectedConditions.elementToBeClickable(ele));
		
		return element;
		

	}

	public static WebElement explicitwait(WebElement ele, int time) {

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement element=wt.until(ExpectedConditions.visibilityOf((ele)));
		
		return element;

	}
	
	
	 public static void emplicitwait(int time) {
			
			
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.alertIsPresent());
			
			
		}
	  
	 

		public static String webpagegettitle(WebElement ele) {
		
		
			String title=ele.getText();
			
			return title;
			

		
		}
		
		
		public static void sendvaluetext(WebElement ele,String value) {
			
			ele.sendKeys(value);
	     
		}
		
    public static void cleartext(WebElement ele) {
			
			ele.clear();
	     
		}
		
	
		public static boolean eleclick(WebElement ele, int time) {
			boolean flag = false;
			try {
				explicitwait(time,ele);
				ele.click();
				test.log(Status.INFO, "element clicked");
				flag = true;
			} catch (Exception e) {

				test.log(Status.FAIL, "Notclicked" + e.getMessage());

			}
		
		return flag;
		
		}
	
	

	public static void select(String text, List<WebElement> ele) {

		for (WebElement s : ele) {

			if (text.equalsIgnoreCase(s.getText())) {

				s.click();
				test.log(Status.INFO, "value selected");
				break;
			}
		}

	}
	
	
	
	public static void alert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	
	
	public static void scroll(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
	}
	public static void javascript(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].focus();", ele);
	}
	
 public static void javascriptclick(WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	
	
}
