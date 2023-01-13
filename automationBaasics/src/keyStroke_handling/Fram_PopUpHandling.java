package keyStroke_handling;

import java.awt.event.WindowAdapter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fram_PopUpHandling {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Alert']")));
	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String str =driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
	System.out.println(str);
		
	}

}
