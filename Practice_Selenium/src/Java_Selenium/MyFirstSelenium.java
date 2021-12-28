package Java_Selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {


	public static void manageOperations() {
		
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		

	}

}
