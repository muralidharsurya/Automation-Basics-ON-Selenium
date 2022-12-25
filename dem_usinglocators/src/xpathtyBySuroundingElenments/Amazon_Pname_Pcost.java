package xpathtyBySuroundingElenments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Pname_Pcost {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("shoes for men");
		Thread.sleep(2000);
		element.submit();
		Thread.sleep(2000);
	String pname= driver.findElement(By.xpath("(//span[text()='ASIAN'])[1]")).getText();
		Thread.sleep(2000);
		String pCost= driver.findElement(By.xpath("(//span[text()='ASIAN'])[1]/../../../following-sibling::div/following-sibling::div/div/a/span/span/span[2]")).getText();
	
		System.out.println(pname+"----------->"+pCost);
		
		
	}

}
