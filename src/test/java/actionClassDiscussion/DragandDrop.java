package actionClassDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	WebElement frame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
	
	driver.switchTo().frame(frame);
	WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	
	WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

	act.dragAndDrop(draggable, droppable).build().perform();
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	
	//slider code
	//act.clickAndHold(droppable).moveByOffset(100, 0).release().build().perform();
	
	driver.close();
}
}
