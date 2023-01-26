package keyStroke_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_visonPopupHandling {
	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		 driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		 //Thread     .sleep(3000);
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	 WebElement ele=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='img'])[1]")));
	 ele.click();
	  	 driver.findElement(By.xpath("//div[@class='delete button']")).click();
		//WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'You are about to d')]"));
	
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
String deleteMsg =	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to d')]"))).getText();
	
		 
		  System.out.println("deleteMsg:"+deleteMsg);
		  
		  
		  driver.close();
		
	}

}
