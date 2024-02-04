package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();



		//Locators By Id
		//		driver.get("https://demoqa.com/text-box");
		//		Thread.sleep(2000);
		//		driver.findElement(By.id("userName")).sendKeys("Rupali");
		//		driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("asd");
		//		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");


		//Locators By class Name
		//		driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Rupali");


		//Locators By linkText

		//		driver.get("https://opensource-demo.orangehrmlive.com/");
		//		Thread.sleep(3000);
		//		WebElement forgotpwd = driver.findElement(By.linkText("OrangeHRM, Inc"));
		//		forgotpwd.click();
		//		String pageTitle = driver.getTitle();
		//		System.out.println("Page Title: " + pageTitle);


		//Locators by partial Link Text
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
//		WebElement forgotpwd = driver.findElement(By.partialLinkText("OrangeHRM"));
//		forgotpwd.click();
//		String pageTitle = driver.getTitle();
//		System.out.println("Page Title: " + pageTitle);



		//customization with text
		String text = driver.findElement(By.xpath("//*[text()='Forgot your password? ']")).getText();
		System.out.println(text);



	}


}

