package xpathtyBySuroundingElenments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_Over_msg_handling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement element= driver.findElement(By.xpath("//input[@title='Do not select if this computer is shared']"));
		String msg = element.getAttribute("title");
		System.out.println(msg);
		
		      
		
		
		
		
		
		
driver.quit();
}
}