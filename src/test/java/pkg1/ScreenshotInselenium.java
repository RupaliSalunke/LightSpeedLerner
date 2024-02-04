package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import utility.TakescreenshotpOfApp;

public class ScreenshotInselenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Alert Pop up with Ok button.
//		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
		//		driver.findElement(By.xpath("//*[@name='alert']")).click();	
		//		driver.switchTo().alert().accept();

		//		TakesScreenshot	scrshot	= (TakesScreenshot)driver;		
		//		File source = scrshot.getScreenshotAs(OutputType.FILE);	
		//		File dest =new File("C:\\Users\\admin\\Desktop\\SC\\ss4.png");
		//		FileHandler.copy(source, dest);


		//called SC method from utility pkg
		//		TakescreenshotpOfApp.captureScreenShot(driver, "ss6");

//		Actions act=new Actions(driver);
//		WebElement sunMenu = driver.findElement(By.xpath("//*[@class=\"dropdown\"]"));
//
//		act.moveToElement(sunMenu).perform();
//		Thread.sleep(2000);
//
//		WebElement chercher = driver.findElement(By.xpath("//*[@id=\"link1\"]"));
//		act.moveToElement(chercher).click().build().perform();
//
//		driver.navigate().back();
//		Thread.sleep(2000);
//		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
//		act.doubleClick(doubleclick).perform();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		act.moveToElement(doubleclick).contextClick().build().perform();

		
		//Drag and drop
		
//		driver.get("https://jqueryui.com/droppable/");

//		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
//
//		driver.switchTo().frame(iframe);
//		
//		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
//		
//		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions act = new Actions(driver);
		
		
//		act.dragAndDrop(draggable, droppable).perform();
//		
//		driver.switchTo().parentFrame();
		
		//clickand Hold
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe2 = driver.findElement(By.xpath("//*[@class='demo-frame']"));

		driver.switchTo().frame(iframe2);
	
		WebElement slider = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));

		act.clickAndHold(slider).moveByOffset(60, 0).release().build().perform();
		
		//		driver.quit();
	}
}
