package testNGDiscussion;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
//	
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.out.println("Before class");
//	}
//	
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("After class");
//	}
//
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("Befor Method");
//	}
//	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("After Method");
//	}

	@Test(priority=-1)
	public void Login(){
		Assert.fail();
		
		System.out.println("TestCase 1 is running");
	}

	@Test(priority=2)
	public void Admin(){
		System.out.println("TestCase 2 is running");
	}

	@Test (priority=0)
	public void Logout(){
		System.out.println("TestCase 3 is running");
	}

	@Test(priority=4)
	public void Dashboard(){
		System.out.println("TestCase 4 is running");
	}
}
