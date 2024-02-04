package actionClassDiscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//TAB key

		//		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		//		WebElement fname = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		//		Actions act=new Actions(driver);
		//		act.sendKeys(fname, "Rupali");
		//		.sendKeys(Keys.TAB).sendKeys("Salunke")
		//		.sendKeys(Keys.TAB).sendKeys("0987654321")
		//		.build().perform();
		//
		//		WebElement Femalegender = driver.findElement(By.xpath("//*[@class=\"q\"]//span[text()='Female']"));
		//		act.click(Femalegender).perform();
		//
		//		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_UP)
		//		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		//		.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
		//		.sendKeys(Keys.TAB).sendKeys("asdf").build().perform();
		//		Thread.sleep(2000);

		//AutoSuggestion Code
		//		driver.get("https://www.google.com/");
		//		WebElement search = driver.findElement(By.xpath("//*[@name ='q']"));
		//		Actions act = new Actions(driver);
		//		act.sendKeys(search,"Webdriver").perform();
		//
		//		Thread.sleep(2000);
		//
		//		try {
		//			List<WebElement> alloptions = driver.findElements(By.xpath("//*[@jsname=\"bw4e9b\"]//li//span[text()='webdriver']"));
		//
		//			for (WebElement opt : alloptions) {
		//				String textOfOption = opt.getText();
		//				System.out.println(textOfOption);
		//
		//				if (textOfOption.contains("manager")) {
		//					Thread.sleep(2000);
		//					opt.click();
		//					System.out.println(driver.getCurrentUrl());
		//
		//				}
		//			}
		//		} catch (StaleElementReferenceException e) {
		//		}



		//Copy Paste Code

		//		act.keyDown(fname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//		
		//		WebElement surname = driver.findElement(By.xpath("//*[@name='lastname']"));
		//		
		//		act.click(surname).perform();
		//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();



		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		//   Wait for the username field to be present and then enter the username
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("Admin");
		System.out.println(usernameField.getAttribute("value"));

		Thread.sleep(3000);

		// Similarly, wait for the password field and enter the password
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys("admin123");

		Thread.sleep(3000);

		// Wait for the login button and click on it
		WebElement loginButton =  driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

		// Wait for a few seconds (you can use WebDriverWait for better synchronization)
		Thread.sleep(3000);

		// Get the title of the dashboard page to verify if login is successful
		String pageTitle = driver.getTitle();
		driver.findElement(By.xpath("//*[@href=\"/web/index.php/pim/viewPimModule\"]")).click();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor)driver;

		// Scroll to  particular pixel
		//		js.executeScript("window.scrollBy(0,1200)");	
		//		Thread.sleep(2000);	
		//		js.executeScript("window.scrollBy(0,-400)");


		// scroll until a webelement
		Thread.sleep(4000);

		WebElement checkbox = driver.findElement(By.xpath("//div[43]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]"));
		js.executeScript("arguments[0].scrollIntoView();", checkbox);



		// Click operation using javascript executor
		//		js.executeScript("arguments[0].click();",checkbox);



		//		driver.quit();
	}
}