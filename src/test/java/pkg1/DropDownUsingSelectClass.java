package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	    driver.manage().window().maximize();
	  
			Thread.sleep(3000);
			WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
			
			Select sel = new Select(day);
		
//			sel.selectByVisibleText("18");
			day.sendKeys("12");
			
			List<WebElement> opt = sel.getOptions();
			
			int count = opt.size();
			
			for(int i=0; i<count; i++)
			{
				String dayvalues = opt.get(i).getText();
				
				System.out.println(dayvalues);
			}
				
			WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
			
			Select selmonth = new Select(month);
			
//			selmonth.selectByValue("10");
			month.sendKeys("Dec");
			
				
			WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
			
			Select selyear = new Select(year);
			
			selyear.selectByIndex(20);
			
			//select year by sendKeys
//			year.sendKeys("1993");
			
		
	}
	
}
