package PracticeOnsalesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreatinganAccount {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://personal157.my.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("smuralidhar6-yqgz@force.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Muralidhar8");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 driver.switchTo().alert().dismiss();
		 driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Accounts']")).click();
		 driver.findElement(By.xpath("(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Account']")).click();
	}

}
