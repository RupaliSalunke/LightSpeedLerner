package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2ndWay {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	    driver.manage().window().maximize();
	  
			Thread.sleep(3000);
			WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
			Select sel=new Select(day);
//			sel.selectByValue(2);
//			sel.selectByValue("10");
			sel.selectByVisibleText("18");
			
			List<WebElement> opt = sel.getOptions();
			
//			int count=opt.size();
//			for(int i=0; i<count; i++)
//			{
//				String dayValue = opt.get(i).getText();
//				System.out.println(dayValue);
//			}
			
			
		for(WebElement opt1:opt)
		{
			String dayValue = opt1.getText();
			System.out.println(dayValue);
		}
	}
}
