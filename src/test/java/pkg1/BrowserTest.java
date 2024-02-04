package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
static WebDriver driver;
	
	public void m1(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))

		{
			driver=new ChromeDriver();	
		}
		else if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}

		driver.get("https://www.flipkart.com/");
		Thread.sleep(30);
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String title = driver.getTitle();// this method provides title of the page
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		BrowserTest bt=new BrowserTest();
		bt.m1("chrome");
		bt.m1("Firefox");
//		bt.m1("Edge");
	}
}
