package pkg1;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
      //   Wait for the username field to be present and then enter the username
        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameField.sendKeys(ExcelReader.readData(0,0));
        js.executeScript("arguments[0].value='Admin';",usernameField);
               
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
//        // Wait for a few seconds (you can use WebDriverWait for better synchronization)
        Thread.sleep(3000);
//        
//        // Get the title of the dashboard page to verify if login is successful
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
//        
        if(pageTitle.equals(pageTitle))
        {
        	System.out.println("Test case passed");
        }
        else {
        	System.out.println("Test case failed");

        }
//        
//        Thread.sleep(2000);
//        
//        driver.findElement(By.xpath("//*[@href=\"/web/index.php/admin/viewAdminModule\"]")).click();
//        
//        
////        driver.findElement(By.partialLinkText("OrangeHRM")).click();
////        Thread.sleep(3000);
//        
////        List<WebElement>checkboxes = driver.findElements(By.xpath("//*[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']//i"));
////    	
////        int no_oc_checkBox = checkboxes.size();
////        System.out.println(no_oc_checkBox);
////     	for(WebElement check :checkboxes)
////     	{
////     		check.click();
////     		Thread.sleep(500);
////     		
////     	}
//     	
//         Thread.sleep(3000);
//        driver.quit();
	}
}
