package pkg1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbReg {

	public static void m1(WebDriver driver, String value) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.guru99.com/");

		driver.findElement(By.xpath("//*[@id=\"menu-item-3173\"]")).click();
		try {
			List<WebElement> allListItems = driver.findElements(By.xpath("//*[@class=\"sub-menu clicked\"]//li"));

			System.out.println("items count is "+allListItems.size());  

			for(WebElement item:allListItems)
			{
				String itemValue = item.getText();
				
				if(itemValue.equalsIgnoreCase(value))
				{
					Thread.sleep(2000);
					item.click();
				}
				System.out.println(itemValue);
			}
		}catch(StaleElementReferenceException e) {
		System.out.println("Handled StaleElementReferenceException e");	
		}
		finally {
			System.out.println("closing driver");
			driver.close();
		}
		}	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();

			//		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
			//		driver.manage().window().maximize();
			//
			//		List<WebElement> Days = driver.findElements(By.xpath("//*[@id=\"day\"]//option"));
			//
			//		for(WebElement day:Days)
			//		{
			//
			//			String Dayss = day.getText();
			//
			//			if(Dayss.equalsIgnoreCase("10"))
			//			{
			//				day.click();
			//			}
			//
			//			System.out.println(Dayss);
			//		}
			m1(driver, "agile testing");

		}


	}
