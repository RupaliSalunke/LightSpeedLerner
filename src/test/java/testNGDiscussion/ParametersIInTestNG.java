package testNGDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersIInTestNG {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void browserSelection(String browsername) {
	    if (browsername.equalsIgnoreCase("Chrome")) {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    } else if (browsername.equalsIgnoreCase("firefox")) {
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	    }
	    driver.quit();
	}

	@Parameters({"environment", "version"})
	@Test
	public void buildInfo(String env, String version) {
	    System.out.println("the environment used is: " + env);
	    System.out.println("The version of build is: " + version);
//	    driver.get("https://www."+env+"orangehrm.com/");
	}



}
