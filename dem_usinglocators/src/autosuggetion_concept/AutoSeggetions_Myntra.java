package autosuggetion_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSeggetions_Myntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Thread.sleep(2000);
		element.sendKeys("headphone");
		Thread.sleep(2000);
		List<WebElement> segg= driver.findElements(By.xpath("//ul[@class='desktop-group']"));
		Thread.sleep(2000);
		for (WebElement elements:segg) {
			String s= elements.getText();
			System.out.println(s);
		}
		driver.close();
	}

}
