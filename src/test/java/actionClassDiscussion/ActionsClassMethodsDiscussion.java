package actionClassDiscussion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethodsDiscussion {
	//Action class discussion

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		Actions act =new Actions(driver);

		act.sendKeys(fname, "Rupali")
		.sendKeys(Keys.TAB).sendKeys("Salunke")
		.sendKeys(Keys.TAB).sendKeys("0987654321").build().perform();

		WebElement gender = driver.findElement(By.xpath("//*[@class=\"q\"]//span[text()='Female']"));
		act.click(gender).perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_UP)
		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.TAB).sendKeys("asdf").build().perform();



	}
}
