package listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import Basecomponent.BaseClass;

public class Itestlistener extends BaseClass implements ITestListener,IAnnotationTransformer{

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String value=result.getMethod().getMethodName();
		try {
			Screenshot(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String value2=result.getMethod().getMethodName();
		failedscreenshots(value2);
		
	}

	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(listener.RetryAnalayzer .class);
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test finish");
	}
}
