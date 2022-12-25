package automationBaasics1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programm7 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",  "E:\\\\Drivers\\\\chromedriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d = new Dimension(300, 700);
		driver.manage().window().setSize(d);
		Point p =new Point(90,60);
		Thread.sleep(3000);
	 String titile=driver.getTitle();
	System.out.println(titile);
	driver.close();
	
	}

}
