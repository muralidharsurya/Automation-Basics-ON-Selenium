package autosuggetion_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggetionAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		element.sendKeys("watch");
		Thread.sleep(2000);
		List<WebElement> segg= driver.findElements(By.xpath("//div[contains(@class,'autocom')]"));
		Thread.sleep(2000);
		for (WebElement elements:segg) {
			String s= elements.getText();
			System.out.println(s);
		}
		driver.close();
	}

}
