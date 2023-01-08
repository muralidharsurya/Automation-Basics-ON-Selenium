package PracticeOnsalesforce;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager;

public class Title_check {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://personal157.my.salesforce.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("smuralidhar6-yqgz@force.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Muralidhar8");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 //driver.switchTo().alert().dismiss();
		 
		 String title = driver.getTitle();
		 if (title.contains("salesforce")) {
			 System.out.println("Test is pass");
		 }
		 else {
			 System.out.println("Test is fail");
		 }
	driver.quit();
	
	}

}
