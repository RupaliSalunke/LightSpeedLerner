package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLang {

	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
			List<WebElement>dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
			
			for(WebElement dayy:dayvalues)
			{
				String daysoption = dayy.getText();
				
				if(daysoption.equalsIgnoreCase("10"))
				{
					dayy.click();
				}
				
				System.out.println(daysoption);
			}
			
			
			
List<WebElement>monthvalues = driver.findElements(By.xpath("//*[@id='month']//option"));
			
			for(WebElement month:monthvalues)
			{
				String monthsoption = month.getText();
				
				if(monthsoption.equalsIgnoreCase("Dec"))
				{
					month.click();
				}
				
				System.out.println(monthsoption);
			}

	}
}
