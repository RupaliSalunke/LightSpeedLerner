package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.TakescreenshotpOfApp;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Alert Pop up with Ok button.
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
		driver.findElement(By.xpath("//*[@name='alert']")).click();	
		driver.switchTo().alert().accept();
	
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;		
		File source = scrshot.getScreenshotAs(OutputType.FILE);	
		File dest =new File("C:\\Users\\admin\\Desktop\\SC\\ss2.png");

		FileHandler.copy(source, dest);
	
		

	}
}
