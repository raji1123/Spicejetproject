package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalayzer implements IRetryAnalyzer{

	int count=0;
	int retrycount=3;
	public boolean retry(ITestResult result) {
		if(count<retrycount) {
			count++;
			return true;
			
		}
		return false;
	}
}
