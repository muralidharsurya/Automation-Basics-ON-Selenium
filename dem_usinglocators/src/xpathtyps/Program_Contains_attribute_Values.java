package xpathtyps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Xpath by contains attribute values
public class Program_Contains_attribute_Values {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("// input[contains(@class,'_2IX_2- VJZ')]")).sendKeys("7981425792");
		 driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Surya123");
		 driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')][1]")).click();
		 
	}

}
