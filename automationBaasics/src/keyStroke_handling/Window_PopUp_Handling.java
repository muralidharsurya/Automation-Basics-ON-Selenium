package keyStroke_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_PopUp_Handling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("i phone 11");
		element.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		
		for(String allId : childId)
		{
			if(!allId.equals(parentId))
			{
				driver.switchTo().window(allId);
			}
		}
		String productName = driver.findElement(By.xpath("//span[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
		System.out.println(productName);
	

		driver.close();
		
	}
	

}
