package xpathtyBySuroundingElenments;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Pname_PCost {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		element.sendKeys("iphone 14 pro max");
		element.submit();
		Thread.sleep(2000);
		String pname = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Space Black, 128 GB)']")).getText();
		Thread.sleep(2000);
		String pcost = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Space Black, 128 GB)']/../following-sibling::div/div[1]/div/div")).getText();
		Thread.sleep(2000);
		System.out.println(pname+"----------."+pcost);
		Thread.sleep(2000);
		driver.quit();
		
	
		
		
	}

}
