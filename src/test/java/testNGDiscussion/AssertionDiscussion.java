package testNGDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.ExcelReader;
import utility.ExtentReport;

public class AssertionDiscussion {

	@Test
	public void Login() throws InterruptedException {
	
		ExtentReport.initializeExtentReport();
        ExtentReport.createTest("Login Test - Valid Credentials");

		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
//        JavascriptExecutor js=(JavascriptExecutor)driver;
        
      //   Wait for the username field to be present and then enter the username
        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameField.sendKeys("Admin");
//        js.executeScript("arguments[0].value='Admin';",usernameField);
               
        System.out.println(usernameField.getAttribute("value"));

    	Thread.sleep(3000);

        // Similarly, wait for the password field and enter the password
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin1234");
        
    	Thread.sleep(3000);

        // Wait for the login button and click on it
        WebElement loginButton =  driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
//        
//        // Wait for a few seconds (you can use WebDriverWait for better synchronization)
        Thread.sleep(3000);
//        
//        // Get the title of the dashboard page to verify if login is successful
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        
        boolean isEquals = pageTitle.equals("OrangeHRM");
        
        System.out.println("is equals: "+isEquals);
        Assert.assertEquals(isEquals, true,"Test Case failed");
        Assert.assertEquals(pageTitle, "OrangeHRM");
       
		
	}
	
	@Test
	public void Login2() {
		Reporter.log("TestCase 2 is running",true);
		System.out.println("TC 2 is running");
		Assert.assertTrue(false);
		System.out.println("After assertion");
	}
	
	@Test
	public void AssertFalse() {
		Reporter.log("TestCase 2 is running",true);
		System.out.println("TC 2 is running");
		Assert.assertFalse(true);
		System.out.println("After assertion");
	}
	
	@Test
	public void AssertNotEquals() {
		Reporter.log("TestCase 2 is running",true);
		System.out.println("TC 2 is running");
		Assert.assertNotEquals(50, 50,"Not equals");
		System.out.println("After assertion");
	}
	
}
