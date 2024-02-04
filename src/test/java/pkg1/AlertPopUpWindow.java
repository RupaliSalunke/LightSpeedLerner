package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Alert Browser PopUp
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"alert\"]")).click();

		//clcik on Ok button
		String textOnAlertpopUp = driver.switchTo().alert().getText();
		System.out.println("Text on pop up window is: "+textOnAlertpopUp);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//Click on cancel button
		driver.findElement(By.xpath("//*[@name=\"confirmation\"]")).click();
		driver.switchTo().alert().dismiss();
	
		
		Thread.sleep(2000);
		//file Upload
		driver.findElement(By.xpath("//*[@name=\"upload\"]")).sendKeys("C:\\Users\\admin\\Desktop\\Intro.txt");
		
	}
}
