package xpathtyps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addto_compare {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("i phone 11");
		element.submit();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Popularity']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[23]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[26]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[28]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[30]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[32]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_24_Dny'])[34]")).click();

}}
