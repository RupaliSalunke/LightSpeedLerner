package actionClassDiscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchField.sendKeys("webdriver");
		Thread.sleep(2000);
		
		try {
		List<WebElement> alloptions = driver.findElements(By.xpath("//*[@jsname=\"bw4e9b\"]//li//span[text()='webdriver']"));
		
		for(WebElement opt:alloptions)
		{
			String textonOptions = opt.getText();
			System.out.println(textonOptions);
			
			if(textonOptions.contains("webdriver"))
			{
				Thread.sleep(2000);
				opt.click();
			}
		}
		}catch(StaleElementReferenceException e)
		{
			System.out.println("Exception Handled "+e.getMessage());
		}
		finally {
//			driver.quit();
		}
	}
}
