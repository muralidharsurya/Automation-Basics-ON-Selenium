package xpathtyBySuroundingElenments;

import java.util.List;

import javax.tools.Diagnostic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAll_ProductNames_Printed {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		element.sendKeys("iphone 11");
		element.submit();
		Thread.sleep(2000);
List<WebElement> productNmaes=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
Thread.sleep(2000);
for(WebElement elements : productNmaes) {
	System.out.println(elements.getText());
	
}
     //driver.quit();

	}}
