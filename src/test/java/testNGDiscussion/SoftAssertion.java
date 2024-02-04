package testNGDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void LogintoApp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.example.com/");
		driver.manage().window().maximize();
		String currentTitle = driver.getTitle();
		System.out.println("Current title of page is: "+currentTitle);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(currentTitle, "Example Domainn","Title is mistmatched");
		
		sa.assertFalse(true,"This should be true");
		System.out.println("assertFalse method expect true argu");
		
		
		driver.quit();
		sa.assertAll();
		
	}
}
