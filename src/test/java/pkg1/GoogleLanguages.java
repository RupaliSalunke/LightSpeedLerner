package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguages {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[text()='हिन्दी']")).click();
//		driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Rupali");

//		WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
//		fullName.sendKeys("Rupali");
		
//		driver.findElement(By.xpath("//*[text()='Web Tables']")).click();
		
		
		 List<WebElement> languageOptions = driver.findElements(By.xpath("//*[@id=\"SIvCob\"]//a"));

	        // Print the text of each language option
	        for (WebElement option : languageOptions) {
	            System.out.println(option.getText());
	        }

	        // Close the browser
	        
	        
	        driver.quit();
	
}
}