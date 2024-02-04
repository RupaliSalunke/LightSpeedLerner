package actionClassDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datepicker.click();

		while(true)
		{
			String title = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]")).getText();

			System.out.println(title);
			
//			if(!(title.equals("April 2023")))	
//			{
//				
//			}
			if(title.equals("April 2023"))
			{
				int date=5;
				WebElement dateselected = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a[text()='"+date+"']"));
				dateselected.click();
				Thread.sleep(2000);
				
				break;

			}
			else {
				WebElement prevBtn = driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]"));
				prevBtn.click();
			}

		}
		
		
		driver.close();
	}
}
