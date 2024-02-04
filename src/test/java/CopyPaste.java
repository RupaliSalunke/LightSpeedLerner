import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//DatePicker
		driver.get("https://jqueryui.com/datepicker/");
		//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Wait up to 10 seconds.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		//        WebElement frame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"demo-frame\"]")));
		WebElement frame= driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);

		//        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"datepicker\"]")));
		WebElement datepicker= driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datepicker.click();

		while (true) {
			//WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"ui-datepicker-title\"]")));
			WebElement titleElement = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
			String title = titleElement.getText();
			System.out.println(title);

			if (title.equals("July 2023")) {
				Thread.sleep(2000);
				int date = 10;
				//                WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a[text()='" + date + "']")));
				WebElement dateElement=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a[text()='" + date + "']"));
				dateElement.click();
				break; // break the loop once the date is selected.
			} else {
				//                WebElement prevbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")));
				WebElement prevbtn=driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]"));
				prevbtn.click();
			}
		}

		// Close the browser.
		driver.quit();
	}
}
