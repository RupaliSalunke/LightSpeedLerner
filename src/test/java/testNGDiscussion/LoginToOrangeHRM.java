package testNGDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToOrangeHRM {

	WebDriver driver;
	

	@Test(priority=1)
		public void Login() throws InterruptedException {
		
			 driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        Thread.sleep(3000);
//	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        
	      //   Wait for the username field to be present and then enter the username
	        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	        usernameField.sendKeys("Admin");
//	        js.executeScript("arguments[0].value='Admin';",usernameField);
	               
	        System.out.println(usernameField.getAttribute("value"));

	    	Thread.sleep(3000);

	        // Similarly, wait for the password field and enter the password
	        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	        passwordField.sendKeys("admin123");
	        
	    	Thread.sleep(3000);

	        // Wait for the login button and click on it
	        WebElement loginButton =  driver.findElement(By.xpath("//button[@type='submit']"));
	        loginButton.click();
//	        
//	        // Wait for a few seconds (you can use WebDriverWait for better synchronization)
	        Thread.sleep(3000);
//	        
//	        // Get the title of the dashboard page to verify if login is successful
	        String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);
	        
	        boolean isEquals = pageTitle.equals("OrangeHRM");
	        
	        System.out.println("is equals: "+isEquals);
	        Assert.assertEquals(isEquals, true,"Test Case failed");
	        Assert.assertEquals(pageTitle, "OrangeHRM");
	        
	        Thread.sleep(7000);
	        
	    	
	}
}
