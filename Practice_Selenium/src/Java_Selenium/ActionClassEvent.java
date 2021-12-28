package Java_Selenium;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassEvent {

	static WebDriver driver;
	
	@Test
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\\\chromedriver\\chromedriver.exe\\");
		driver=new ChromeDriver();
	    	
	}
	
	@Test
	public static void openApplicationUrl(){
		driver.get("http:\\www.amazon.in");	
	}
	
	@Test(priority = 1)
	public void handleMouseEvent() {
		
		WebElement signLnk=driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
		Actions action=new Actions(driver);
		
		//action.moveToElement(signLnk).perform();
		//action.moveToElement(driver.findElement(By.xpath("//div [@data-value='search-alias=aps']"))).perform();
		
		//action.moveToElement(driver.findElement(By.linkText("Gift a Smile"))).perform();
		
		action.keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.xpath("//input[@aria-label='Search']")),"phone").perform();
		action.keyUp(Keys.SHIFT).perform();
		
	
		
		
		
	}

}
