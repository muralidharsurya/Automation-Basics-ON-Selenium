package retriveDataFromExcel;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excution {
	public static void main(String[] args) throws Exception {
		
	DataUtility dutil = new DataUtility();
	
	String URL = dutil.getDataFromProperties("url");
	String USERNAME = dutil.getDataFromProperties("usernmae");
	String PASSWORD = dutil.getDataFromProperties("password");
	// read necessary from excel
	 String CUTSOMERNAME  = dutil.getDataFromExcel("Sheet2", 0,1);
	 String CUSOTMERDISCRIPTION = dutil.getDataFromExcel("Sheet2", 3, 1);
	  Random r = new Random();
	  int num = r.nextInt(1000);
	   //lunching browser
	  WebDriver driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(USERNAME);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	  driver.findElement(By.xpath("//div[@class='addNewButton']")).click();	  
	  driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(CUTSOMERNAME+num);
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(CUSOTMERDISCRIPTION);
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   driver.quit();
	  
	  
	 
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
