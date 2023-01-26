package keyStroke_handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hidden_WebELements {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions atc = new Actions(driver);
		atc.clickAndHold(ele).build().perform();
		WebElement el = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[3]"));
		 String str =el.getText();
		System.out.println("GamingName:"+str);
		
		List<WebElement>  lst= driver.findElements(By.xpath("//div[@class='_2IjXr8']"));
		for (WebElement elements:lst) {
		 String allNames=elements.getText();
		 System.out.println(allNames);
		
			
		}
		
		
		
	}

}
