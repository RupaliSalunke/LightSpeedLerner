package actionClassDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"sub-menu\"]"));
		Actions act =new Actions(driver);
//		act.moveToElement(subMenu).perform();

		//		WebElement cherTech = driver.findElement(By.xpath("//*[@id=\"link1\"]"));
		//		act.moveToElement(cherTech).click().build().perform();
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		String textOnpopup = driver.switchTo().alert().getText();
		System.out.println(textOnpopup);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		
		act.moveToElement(doubleclick).contextClick().build().perform();
//		driver.close();
	}
}
