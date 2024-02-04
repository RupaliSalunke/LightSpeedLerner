package testNGDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogOutOrangeHRM extends LoginToOrangeHRM {

	@Test (priority=2)
	public void Logout() throws InterruptedException
	{
       
	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@class=\"--active oxd-userdropdown\"]/ul/li/a[@href=\"/web/index.php/auth/logout\"]")).click();
	}
}
