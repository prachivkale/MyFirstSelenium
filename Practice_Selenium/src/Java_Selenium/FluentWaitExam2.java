package Java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	
	public class FluentWaitExam2 {
		static WebDriver driver;
		
		@Test
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\\\chromedriver\\chromedriver.exe\\");
			driver=new ChromeDriver();
		    	
		}
		
		@Test
		public static void openApplicationUrl(){
			driver.get("http:\\www.facebook.com");	
		}
		
		@Test(priority = 1)
		public void openRegistrationForm()throws InterruptedException{
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[title='Day']")));
			WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
			
			System.out.println(date.getTagName());
		}

	}


