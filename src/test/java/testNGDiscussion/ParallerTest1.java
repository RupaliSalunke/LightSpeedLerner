package testNGDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerTest1 {


	@Parameters("browser")
	@Test
	public void browserSelection(String browsername) {
	    if (browsername.equalsIgnoreCase("Chrome")) {
	    	WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	    }
	}
	    
	@Parameters("browser")
	@Test
	    public void browserSelection2(String browsername) {
		    if (browsername.equalsIgnoreCase("chrome")) {
		    	WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    }   
	}
	
	@Parameters("browser")
	@Test
	    public void browserSelection3(String browsername) {
		    if (browsername.equalsIgnoreCase("chrome")) {
		    	WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://toolsqa.com/");
		        driver.close();

		    }   
	}
}
