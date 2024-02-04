package actionClassDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);

		WebElement ifame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));

		driver.switchTo().frame(ifame);
		System.out.println("switched to frame");
		WebElement sliderbtn = driver.findElement(By.xpath("//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		act.clickAndHold(sliderbtn).moveByOffset(200, 0).release().build().perform();
		driver.switchTo().parentFrame();
		
		driver.close();
	}
}
