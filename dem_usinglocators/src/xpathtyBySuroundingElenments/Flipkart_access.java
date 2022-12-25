package xpathtyBySuroundingElenments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_access {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		element.sendKeys("mobiles");
		element.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[26]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[28]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[32]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[34]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[38]")).click();
		driver.quit();
		

	}

	
}
