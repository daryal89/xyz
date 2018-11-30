package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static WebDriver driver;
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\creat\\eclipse-workspace\\XYZ\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("")).sendKeys("truth_aryal@yahoo.com");
		driver.findElement(By.xpath("")).sendKeys( );
		
	}

}
