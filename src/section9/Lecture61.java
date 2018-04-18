package section9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lecture61 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hotels.edreams.com/?selected_currency=EUR;lang=en;label=edr-link-com-seoairlines-conf-pc-of;aid=350435;esd=UmFuZG9tSVYkc2RlIyh9YeK5g2UlR2_2zDk3YHvOM9qNjwTztMIV0S6ZTHqAf5TJk04aaHiN_UaHrDn-Bji8LskNTojY3ABI;esid=UmFuZG9tSVYkc2RlIyh9YbGgAwlPw--2uSTPPLAPrsG2tfIvrgibBp4HfGWBWOvBxIHQVh7CaTg;edcid=UmFuZG9tSVYkc2RlIyh9YZmrXPe2KMLf");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("  //span[@class='b-button__text']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		/*
		String s = driver.findElement(By.xpath("//*[contains(text(),'The Manha')]")).getText();
		System.out.println(s);
		*/
		
		System.out.println("wait applied");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sr_item_main_block']/h3/a)[1]")));
		System.out.println("Waiting");
		driver.findElement(By.xpath("(//div[@class='sr_item_main_block']/h3/a)[1]")).click();
		
	}

}
