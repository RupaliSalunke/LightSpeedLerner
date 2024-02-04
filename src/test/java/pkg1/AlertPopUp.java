package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Child Browser PopUp
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(2000);

		String textonalert = driver.switchTo().alert().getText();

		System.out.println("String on Alert is :"+textonalert);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		//Alert Pop up with Ok and cancel button.	
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();

		String confirmationalerttext = driver.switchTo().alert().getText();

		System.out.println(confirmationalerttext);

		driver.switchTo().alert().dismiss();// clicking on Cancel button

		Thread.sleep(3000);

		//File Uploading

		driver.findElement(By.xpath("//*[@name=\"upload\"]")).sendKeys("C:\\Users\\admin\\Desktop\\Intro.txt");
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
