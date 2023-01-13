package keyStroke_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliding_Handling {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
			element.sendKeys("apple watch");
			element.submit();
			WebElement  slider1= driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
			WebElement slider2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
			Actions ac = new Actions(driver);
			
			ac.dragAndDropBy(slider1, 30, 0).perform();;
			Thread.sleep(3000);
			ac.dragAndDropBy(slider2, -70, 0).perform();;
		
			//driver.close();
			
			
	}
}
