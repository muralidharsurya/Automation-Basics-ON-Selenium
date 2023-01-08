package autosuggetion_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetionSerachnFlipkartPrint {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
	WebElement element =driver.findElement(By.xpath("//input[@class='_3704LK']"));
	Thread.sleep(2000);
	 element.sendKeys("sheos");
	 List<WebElement> suggestion = driver.findElements(By.xpath("//ul[contains(@class,'col-12')]"));
		Thread.sleep(2000);
	for(WebElement elements :suggestion) {
		String s = elements.getText();
		Thread.sleep(2000);
		System.out.println(s);
	}
		driver.close();
	}

}
