package testNGDiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusion {


	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before class is running");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1 is running");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 is running");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test3 is running");
	}
}
