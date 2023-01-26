package keyStroke_handling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot_Handling {
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
			TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("E:\\auto_acreenshot\\shot.png");
			Files.copy(src,dest);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[text()']")).click();
			
			
			
	

}}
