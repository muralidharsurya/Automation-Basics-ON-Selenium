package keyStroke_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windoe_popUpHnalingM2 {
	public static void main(String[] args) throws InterruptedException {
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
	    Iterator<String> itr = childId.iterator();
	    while(itr.hasNext()) {
		String allId = itr.next();
		String childId1=  driver.switchTo().window(allId).getTitle();
		  if(childId1.contains(parentId)){
			  break;
		  }
	}
	   Thread.sleep(3000);
   	   String productName = driver.findElement(By.xpath("//span[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
	   System.out.println(productName);
	   driver.quit();
		
	}
	
	

}
