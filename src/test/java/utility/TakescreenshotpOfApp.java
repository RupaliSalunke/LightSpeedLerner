package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakescreenshotpOfApp {

	
	public static void captureScreenShot(WebDriver driver, String filename) throws IOException 
	{
		TakesScreenshot	scrshot	= (TakesScreenshot)driver;		
		File source = scrshot.getScreenshotAs(OutputType.FILE);	
			
		//Change SC name 		
//		File destination = new File("E:\\SeleniumJavaProject\\SeleniumFramework\\Screenshot\\"+filename+".png");
		
		//To save SC in project folder
		String path = System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png";
		System.out.println(path);
		File destination=new File(path);
		FileHandler.copy(source, destination);
		
	}
	

}
