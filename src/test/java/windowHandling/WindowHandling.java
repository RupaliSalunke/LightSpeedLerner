package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Window Id: "+parentId);
		System.out.println("Parent window Title "+driver.getTitle());

		driver.findElement(By.xpath("//*[@id=\"multi\"]")).click();

		Set<String> AllId = driver.getWindowHandles();
		int countOfWindow = AllId.size();
		System.out.println("count Of Window: "+countOfWindow);
		for(String WID:AllId)
		{
			System.out.println("Child window Id: "+WID);
			if(!(parentId.equals(WID)))
			{
				driver.switchTo().window(WID);
				System.out.println(driver.getTitle());
				driver.close();
			}

		}

		driver.quit();
	}
}
