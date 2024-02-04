package actionClassDiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//scroll up to pixel value
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,800)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-400)");
	
	
	//scroll to bottom by 2 ways
    js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
//    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

//
//	WebElement togglebtn = driver.findElement(By.xpath("//*[@href=\"https://jqueryui.com/toggle/\"]"));
//	js.executeScript("arguments[0].scrollIntoView();",togglebtn);
//	Thread.sleep(3000);
//	js.executeScript("arguments[0].click();",togglebtn);
    
    //send text using javascriptexecutor
//    js.executeScript("arguments[0].value='Admin';",WebElement);

	
//	int a[]= {1,3,4,2,5};
////	o/p: 1,2,3,4,5
//	int min=a[0];
//	for(int i=1; i<a.length;i++)
//	{
//		if(a[i]<min)
//		{
//			min=a[i];
//		}
//	}
//	System.out.println(min);
	
	
	
}
}
