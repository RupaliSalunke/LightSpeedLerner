package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentid = driver.getWindowHandle();
		System.out.println("Parent window id is :"+parentid);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);

		Set<String> allwindow = driver.getWindowHandles();

		int countofwindow = allwindow.size();

		System.out.println("Total number of windows are: "+countofwindow);

		String [] id = new String[countofwindow];

		int i=0;
		for(String ids:allwindow)
		{
			id[i]=ids;
			i++;
		}


		driver.switchTo().window(id[2]);

		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_action_request\"]")).click();

		Thread.sleep(2000);

		driver.switchTo().window(parentid);// switching to parent id

		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usernameField.sendKeys("Admin");
		//js.executeScript("arguments[0].value='Admin';",usernameField);

		System.out.println(usernameField.getAttribute("value"));

		Thread.sleep(3000);

		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordField.sendKeys("admin123");

		Thread.sleep(3000);

		WebElement loginButton =  driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
