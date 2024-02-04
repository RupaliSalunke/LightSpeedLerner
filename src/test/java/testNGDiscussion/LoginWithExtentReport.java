package testNGDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ExtentReport;

public class LoginWithExtentReport {
    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Specify the folder path for the Extent Report
        String reportFolderPath = "Reports/";

        // Specify the report path
        String reportPath = reportFolderPath + "ExtentReport.html";

        // Initialize Extent Report with the specified report path
        ExtentReport.initializeExtentReport(reportPath);

        // Create a test
        ExtentReport.createTest("Login Test - Valid Credentials");

        // Your test logic goes here
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);

        // Log information about the test
        ExtentReport.logInfo("Navigated to OrangeHRM login page");

        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameField.sendKeys("Admin");

        Thread.sleep(3000);

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin123");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(3000);

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Log information about the test result
        if (pageTitle.equals("OrangeHRM")) {
            ExtentReport.logPass("Login successful");
        } else {
            ExtentReport.logFail("Login failed");
            Assert.fail("Login failed");
        }

        // Quit the browser
        driver.quit();

        // Flush Extent Report to generate the report
        ExtentReport.flushExtentReport();
    }
}
