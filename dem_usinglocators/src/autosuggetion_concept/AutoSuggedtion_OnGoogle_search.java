package autosuggetion_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggedtion_OnGoogle_search {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		 element.sendKeys("Dhoni");
		 Thread.sleep(2000);
	List<WebElement>seggestion = driver.findElements(By.xpath("//div[@class='erkvQe']"));
	 Thread.sleep(2000);
	
	for (WebElement elements : seggestion) {
	String s= elements.getText();
	 Thread.sleep(2000);
	System.out.println(s);
	}
		   driver.close();
		   
	}

}
