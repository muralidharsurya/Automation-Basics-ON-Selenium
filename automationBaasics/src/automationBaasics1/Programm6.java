package automationBaasics1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programm6 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",  "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Dimension d= new Dimension(300, 700);
	driver.manage().window().setSize(d);
	Thread.sleep(4000);
	Point p = new Point (800,500);
	driver.manage().window().setPosition(p);
	Thread.sleep(4000);
	driver.close();

	
	}

	}


