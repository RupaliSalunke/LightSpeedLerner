package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//		ChromeDriver driver1=new ChromeDriver();

		driver.manage().window().maximize();
		//		Options m = driver.manage();
		//		Window w = m.window();
		//		w.maximize();

		//Child Browser PopUp
		driver.get("https://groww.in/");
		//		driver.navigate().to("https://groww.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn96DefaultClass absolute-center cur-po bodyBaseHeavy contentPrimary cur-po btn96MediumButton btn96ButtonLabel contentOnColour backgroundAccent btn96ButtonHover\"]")).click();

		WebElement closebtn = driver.findElement(By.xpath("//*[@class=\"rodal-close\"]"));
		Thread.sleep(2000);

		boolean isDisplayed = closebtn.isDisplayed();
		System.out.println("Before CLick :"+isDisplayed);

		closebtn.click();

		boolean isDisplayedafter = closebtn.isDisplayed();
		System.out.println("After CLick :"+isDisplayedafter);

		Thread.sleep(2000);
		driver.close();
	}
}
