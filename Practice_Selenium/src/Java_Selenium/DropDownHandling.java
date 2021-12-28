package Java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {

	static WebDriver driver;
	
	@Test
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\\\chromedriver\\chromedriver.exe\\");
		driver=new ChromeDriver();
	    	
	}
	
	@Test
	public static void openApplicationUrl(){
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");	
	}
	
	@Test(priority = 1)
	public void openRegistrationForm()throws InterruptedException{
		driver.findElement(By.xpath("//a[@data-testid-'open-registration-form-button']")).click();
		Thread.sleep(5000);
		Select select=new Select(driver.findElement(By.xpath("//select[@title='Day']")));
		String date=select.getFirstSelectedOption().getText();
		System.out.println(date);
		select.selectByIndex(1);
		
	}

}
