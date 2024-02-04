package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");		
		Thread.sleep(3000);
		
		WebElement disabledbtn = driver.findElement(By.xpath("//*[@id=\"disable\"]"));
		boolean isEnabled = disabledbtn.isEnabled();
		System.out.println("Before Operation "+isEnabled);
		
		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		
		Thread.sleep(12000);
		boolean afteroperationisEnabled = disabledbtn.isEnabled();
		System.out.println("Before Operation "+afteroperationisEnabled);
		
	
		//IsDisplayed Method:
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        Thread.sleep(5000);
//        
//        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
//       boolean isDisplayed = usernameField.isDisplayed();
//        System.out.println(isDisplayed);
//        usernameField.sendKeys("Admin");
//        
        
	}
}
