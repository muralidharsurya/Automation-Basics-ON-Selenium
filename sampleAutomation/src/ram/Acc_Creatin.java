package ram;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Acc_Creatin {
	public static void main(String[] args) throws Exception {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize(); 
		 driver.get("https://personal157.my.salesforce.com/");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("smuralidhar6-yqgz@force.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Muralidhar8");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 WebElement ele=    driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));;
		 Actions act = new Actions(driver);
		 act.doubleClick(ele).perform();
		 driver.findElement(By.xpath("//div[@title='New']")).click();	 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='input-674']")).sendKeys("surya");
//		 driver.findElement(By.xpath("//input[@id='input-456']")).sendKeys("7893432321");
//		 driver.findElement(By.xpath("(//span[text()='Global Media (Sample)'])[2]")).click();
//		 driver.findElement(By.xpath("(//span[text()='Investor'])[2]")).click();
//		 driver.findElement(By.xpath("//span[text()='Technology']")).click();
//		
//	
		 
 
 
		 //driver.close();
	
		 
		 
		 
		 
	}

}
