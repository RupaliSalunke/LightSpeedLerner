package testNGDiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(enabled=true)
public class TestCase3 {

	
	@Test(priority=1)
	public void Login(){
		Assert.fail();
		System.out.println("TestCase 1 is running from testClass3");
	}

	@Test(priority=2, enabled=false)
	public void Admin(){
		System.out.println("TestCase 2 is running from testClass3");
	}

	@Test (priority=3)
	public void Logout(){
		System.out.println("TestCase 3 is running from testClass3");
	}

	@Test(priority=4,invocationCount=5)
	public void Dashboard(){
		System.out.println("TestCase 4 is running from testClass3");
	}
}
