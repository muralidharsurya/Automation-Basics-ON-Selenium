package xpathtyBySuroundingElenments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAll_Product_Price {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		element.sendKeys("moblie");
		element.submit();
		Thread.sleep(2000);
List<WebElement> productPrice=driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
Thread.sleep(2000);
for(WebElement elements : productPrice) {
	System.out.println(elements.getText());
	
}
driver.quit();

}
}