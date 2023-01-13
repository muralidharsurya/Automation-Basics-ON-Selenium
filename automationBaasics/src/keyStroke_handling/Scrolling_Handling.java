package keyStroke_handling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Handling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
        driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		element.sendKeys("onepluse");
		element.submit();
		
		/*
		 With help of JavaScriptExcutor
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,3000);");
	
	*/
		
		//with the help of Robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
