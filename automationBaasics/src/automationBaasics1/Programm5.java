package automationBaasics1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.atn.WildcardTransition;

public class Programm5 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d = new Dimension(300, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		driver.close();
		
	}

}
