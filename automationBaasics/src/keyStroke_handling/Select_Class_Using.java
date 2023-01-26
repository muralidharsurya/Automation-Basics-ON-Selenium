package keyStroke_handling;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_Class_Using {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
       driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
     driver.findElement(By.xpath("//select[@id='input-country']"));
       WebElement e =driver.findElement(By.xpath("//option[text()='Angola']"));
      // List<WebElement> elements = driver.findElements(By.xpath("//select[@name='country_id']"));
      e.click();
       
       
       Select s = new Select(e);
        
      // s.selectByVisibleText("American Samoa");
		s.selectByValue("6");
		Thread.sleep(3000);
		s.deselectByValue("6");
		//s.selectByIndex(73);
       
		/*
		 * // for(WebElement a:elements) { String countryName=a.getText();
		 * System.out.println(countryName); }
		 */
       
       
       
      /* 
       Iterator<WebElement> itr =elements.iterator();
       while(itr.hasNext()) {
    	   String value = itr.next().getText();
    	   System.out.println(value);
       }*/
       
	}

}
