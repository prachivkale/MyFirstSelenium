package Java_Selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitsFluent {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        Duration dur=Duration.ofSeconds(20);
        Duration dur1=Duration.ofSeconds(2);
        driver.findElement(By.xpath("//button")).click();
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(dur).pollingEvery(dur1);
        
        System.out.println("Browser Open successfulyy");
        WebElement element=wait.until(new Function<WebDriver,WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				WebElement ele=driver.findElement(By.xpath("//p[@id='demo']"));
				System.out.println(ele.getText());
				if(ele.getText().equalsIgnoreCase("QT"))
				{
					return ele;
				}else {
				return null;
				}
			}
		});
        System.out.println(element.getText());
	}

}
