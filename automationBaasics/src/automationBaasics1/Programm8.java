package automationBaasics1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.
chrome.ChromeDriver;

public class Programm8 {public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",  "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	Navigation navi = driver.navigate();
	/*
	 * navi.to("https://demo.actitime.com/login.do"); Thread.sleep(3000);
	 * navi.to("https://www.flipkart.com/"); Thread.sleep(3000); navi.back();
	 * Thread.sleep(3000); navi.forward(); Thread.sleep(3000); navi.refresh();
	 * driver.close();
	 */
	
	
	// optimize part
	
	driver.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(300);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	 Thread.sleep(3000);
	 driver.close();
	 
	
}}
