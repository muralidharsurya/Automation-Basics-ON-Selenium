package xpathtyBySuroundingElenments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Shoes_priceandcost {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Thread.sleep(2000);
		element.sendKeys("shoes");
		element.submit();
		Thread.sleep(2000);
	List<WebElement> pname=driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		
		List<WebElement> pcost=driver.findElements(By.xpath("//a[@class='IRpwTa']/following-sibling::a[1]/div[1]/div[1]"));
		
		for(int i=0;i<pname.size();i++) {
			System.out.println(pname.get(i).getText()+"---->"+pcost.get(i).getText());
    			
		}
		driver.quit();
}
}