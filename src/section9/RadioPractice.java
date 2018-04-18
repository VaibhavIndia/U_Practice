package section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@data-reactid='172']/div/div[2]/label")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Postpaid')]")).click();
		
	}

}
