package xpathtyBySuroundingElenments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_PName_Ppricce {
	public static void main(String[] args) throws InterruptedException  {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/ref=nav_logo");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		 
		 element.sendKeys("sheo");
		 Thread.sleep(2000);
		 element.submit();
		 String pname = driver.findElement(By.xpath("//span[text()='Mens Sm-323 Sneaker']")).getText();
		 Thread.sleep(2000);
		 String pPrice= driver.findElement(By.xpath("//span[text()='Mens Sm-323 Sneaker']/../../../following-sibling::div[2]/div/a/span[1]/span[2]/span[2]")).getText();
		 Thread.sleep(2000);
		 System.out.println(pname+"------>"+pPrice);
		 driver.quit();
				 
	}

}
