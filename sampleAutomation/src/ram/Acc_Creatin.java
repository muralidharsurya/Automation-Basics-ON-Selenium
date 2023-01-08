package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acc_Creatin {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://personal157.my.salesforce.com/");
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("smuralidhar6-yqgz@force.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Muralidhar8");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Accounts']")).click();
		 driver.findElement(By.xpath("")).click();
		 
	}

}
