package pkg1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsPresentMethod {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"rct-collapse rct-collapse-btn\"]")).click();		
		Thread.sleep(3000);

		//		driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']"));

		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
		System.out.println("No of Checkboxes "+allCheckBoxes.size());

//			for(WebElement checkBox:allCheckBoxes)
//			{
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//				 wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
//			}
//			for(WebElement checkBox:allCheckBoxes)
//			{
//				try {
//					checkBox.click();
//				}
//				catch(StaleElementReferenceException e)
//				{
//					e.printStackTrace();
//					checkBox.click();
//				}
//			}
			
		
		WebElement checkBox1 = driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']"));
	
			boolean isChecked = checkBox1.isSelected();
			System.out.println(isChecked);
			
			
//			checkBox1.click();
//			boolean afterClick = checkBox1.isSelected();
//			System.out.println(afterClick);
			
			
		driver.quit();
	}
	
	
}

