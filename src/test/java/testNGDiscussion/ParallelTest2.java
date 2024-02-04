package testNGDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest2 {

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
