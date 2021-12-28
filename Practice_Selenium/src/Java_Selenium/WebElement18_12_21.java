package Java_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement18_12_21 {

	static WebDriver driver;
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void openApplicationUrl(String url)
	{
		driver.get(url);
	}
	
	public static void getElements()
	{
		List<WebElement> inputFieldElements=driver.findElements(By.xpath(""));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
