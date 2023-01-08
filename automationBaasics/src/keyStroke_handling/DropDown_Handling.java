package keyStroke_handling;





import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Handling {
	public static void main(String[] args) throws Throwable {
		 WebDriver driver = new  ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Quality Assurance']")).click();
	
	//throgh robot class;
	
	/*Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);*/
	
	

	
/*List<WebElement> elements=	driver.findElements(By.xpath("//div[@role='listbox']"));
     
for (int i=0;i<elements.size();i++) {
	String ele=elements.get(i).getText();
	Thread.sleep(3000);
	System.out.println(ele);
	*/
		
	
	
}




	}


