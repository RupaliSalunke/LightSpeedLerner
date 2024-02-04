package TestNGdiscussion2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(priority=1)
	public void Login(){
		
		
		System.out.println("TestCase 1 is running from testClass3");
		System.out.println("TestCase 1 is running from testClass3");
		Assert.fail();
		System.out.println("TestCase 1 is running from testClass3");
		System.out.println("TestCase 1 is running from testClass3");
	
		
	}

	@Test(priority=2 )
	public void dependsOnMethods(){
		System.out.println("TestCase 2 is running from testClass3");
	}
//	
//	@Test(priority=3, dependsOnMethods ="Admin" )
//	public void Dashboard(){
//		System.out.println("TestCase 4 is running from testClass3");
//	}
//
//	@Test (priority=4,dependsOnMethods ="Dashboard"  )
//	public void Logout(){
//		System.out.println("TestCase 3 is running from testClass3");
//	}
//	
//	@Test
//	public void tc5()
//	{
//		System.out.println("Test Case 5 is running");
//	}

	
}
