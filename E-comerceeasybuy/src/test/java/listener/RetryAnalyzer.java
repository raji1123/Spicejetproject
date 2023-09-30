package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count=0;
	int Retrycount=3;
	
	boolean flag=false;
	public boolean retry(ITestResult result) {
		
		
		if(count<Retrycount) {
			
			count++;
			return true;
		}
		
		
		
		return false;
	}

}
