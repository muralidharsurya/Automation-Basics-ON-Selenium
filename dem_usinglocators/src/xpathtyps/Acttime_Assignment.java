package xpathtyps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acttime_Assignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'item create')]")).click();
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder n')]")).sendKeys("Suryaram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("automationengg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String actualName=driver.findElement(By.xpath("//div[text()='Suryaram']")).getText();
		
		 String exepectedName="Suryaram";
		if(actualName.equals(exepectedName)) {
			System.out.println("Acount Creted sucessfully ");
		}else {
			System.out.println("Not sucessfully created account");
		}
		
	}

}
