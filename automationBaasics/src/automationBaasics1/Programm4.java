package automationBaasics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Programm4 {
	public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.chrome.driver", "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(4000);
		  driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.manage().window().minimize();
		 Thread.sleep(4000);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.close();
		   
	}

}
