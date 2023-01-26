package keyStroke_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clendar_Scenario {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
	Actions act = new Actions(driver);
	act.click(ele).build().perform();
	String date=driver.findElement(By.xpath("//a[@data-date='26']")).getText();
	System.out.println(date);
	driver.quit();
}
	
	
	
}
