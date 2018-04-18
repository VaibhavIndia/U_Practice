package section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lector_50 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		WebElement brt = driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
		brt.click();
		// to get the text from alert
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		// to accept the alert
		driver.switchTo().alert().accept();
		
		/*
		 to reject the alert
		 		driver.switchTo().alert().dismiss();
		 
		 to send text to alert
		 
		 		driver.switchTo().alert().sendkeys("text");
		 */
		
	}

}
