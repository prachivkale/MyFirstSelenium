package Java_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_18_12_21 {

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
	
	public static void getWindowHandle() {
		String parentHandle= driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> handles= driver.getWindowHandles();
		System.out.println(handles);	
		
		Iterator<String> itr = handles.iterator();
		
		while (itr.hasNext())
		{
			driver.switchTo().window(itr.next());
		    System.out.println("Title = "+driver.getTitle());
		    System.out.println("Url = "+ driver.getCurrentUrl());		}
	}
	
	public static void takeScreenShot()
	{
		TakesScreenshot tScreenshot=(TakesScreenshot) driver;
		File file=tScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\prach\\eclipse-workspace\\Practice_Selenium\\Screeshot\\");
		try {
			FileUtils.copyFile(file,destFile);
		}catch(IOException e) {
			
		}
		WebElement element=driver.findElement(By.xpath("//"));
		File srcFile=element.getScreenshotAs(OutputType.FILE);
		File destFile2=new File("C:\\Users\\prach\\eclipse-workspace\\SelectJava\\Screenshot");
		
	}
	public static void main(String[] args) {
		launchBrowser();
		openApplicationUrl("https://www.naukri.com/");
		getWindowHandle();
	}

}
