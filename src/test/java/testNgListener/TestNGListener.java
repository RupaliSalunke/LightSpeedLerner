package testNgListener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.TakescreenshotpOfApp;

public class TestNGListener extends ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//It will give current running method name
		System.out.println("Test case :"+result.getName()+" has been started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//It will give currently passed method name

		System.out.println("Test case :"+ result.getName()+" has been Passed");
		
	}

	@Override// result.getname gives us test case name
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been failed");
		try {
			TakescreenshotpOfApp.captureScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case :"+ result.getName()+" has been skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override// context.getname gives us the <Test> name
	public void onStart(ITestContext context) {
		//It will give current running test tag name

		System.out.println(context.getName()+" has been started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//It will give current running test tag name

		System.out.println(context.getName()+" has been completed");
	}
}
