package windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	static WebDriver driver;
	public static void switchToRight1(String WindowURL, List<String>listedWid) throws InterruptedException
	{
		for(String wid:listedWid)
		{
			driver.switchTo().window(wid);
			String URLOfChilds = driver.getCurrentUrl();
			System.out.println("TitleOfChilds: "+URLOfChilds);
			if(URLOfChilds.contains(WindowURL))
			{
				System.out.println("switched window");
				driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
				System.out.println("Alert opened");
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				driver.close();
				
			}
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();	
		System.out.println("Parent Id is"+parentId);

		driver.findElement(By.xpath("//*[@id=\"multi\"]")).click();
		Set<String> allId2 = driver.getWindowHandles();
		List<String>listedWid=new ArrayList<String>(allId2);
		switchToRight1("https://letcode.in/alert", listedWid);
		driver.quit();	
	}

}
