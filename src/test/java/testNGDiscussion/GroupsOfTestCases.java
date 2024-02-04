package testNGDiscussion;

import org.testng.annotations.Test;

public class GroupsOfTestCases {

	@Test(groups="Smoke")
	public void Sanity()
	{
		System.out.println("Smoke1 is running");
	}
	
	@Test(groups="Smoke")
	public void Smoke()
	{
		System.out.println("Smoke is running");
	}
	@Test(groups="Regression")
	public void Regression()
	{
		System.out.println("Regression is running");
	}
	@Test(groups="Functional")
	public void Functionl()
	{
		System.out.println("Functionl is running");
	}
}
