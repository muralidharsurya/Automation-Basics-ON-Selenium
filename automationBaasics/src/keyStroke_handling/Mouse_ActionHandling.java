package keyStroke_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_ActionHandling {
	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
		   Actions act= new Actions(driver);
		   Thread.sleep(3000);
		   act.moveToElement(element).contextClick().build().perform();
			
			  Robot r = new Robot(); r.keyPress(KeyEvent.VK_DOWN);
			  r.keyRelease(KeyEvent.VK_DOWN);
			  
			 r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
			  
			  r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
			  
			  r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
			  
			  
			  r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
			  r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
			  r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
			  driver.close();
		   
		   
		   
	}

}
