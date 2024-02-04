package testNGDiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {

//	@BeforeSuite
//	public void beforeSuite()
//	{
//		System.out.println("Before Suite");
//	}
//	
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("After Suite");
//	}
//	
//	
//	@BeforeTest
//	public void beforeTest()
//	{
//		System.out.println("Before Test");
//	}
//	
//	@AfterTest
//	public void afterTest()
//	{
//		System.out.println("After Test");
//	}
	
	@Test(priority=-1)
	public void Login(){
		System.out.println("TestCase 1 is running from testClass2");
	}

	@Test(priority=2)
	public void Admin(){
		System.out.println("TestCase 2 is running from testClass2");
	}

	@Test (priority=0)
	public void Logout(){
		System.out.println("TestCase 3 is running from testClass2");
	}

	@Test(priority=4)
	public void Dashboard(){
		System.out.println("TestCase 4 is running from testClass2");
	}
	


	
}
