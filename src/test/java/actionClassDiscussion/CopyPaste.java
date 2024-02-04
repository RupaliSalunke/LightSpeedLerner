package actionClassDiscussion;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class CopyPaste {
	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
			driver.manage().window().maximize();
			WebElement fname = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
			Actions act =new Actions(driver);
	
			act.sendKeys(fname,"Rupali")
			.keyDown(Keys.CONTROL).sendKeys("a")
			.keyUp(Keys.CONTROL).build().perform();
	
			act.keyDown(Keys.CONTROL).sendKeys("c")
			.keyUp(Keys.CONTROL).build().perform();
	
			WebElement lastName = driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
			act.click(lastName).keyDown(Keys.CONTROL).sendKeys("v")
			.keyUp(Keys.CONTROL).build().perform();
	
		}
	}
