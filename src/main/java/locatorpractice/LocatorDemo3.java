package locatorpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("namrata");
		//OR
		driver.findElement(By.cssSelector("input#email")).sendKeys("namrata");
		
		driver.findElement(By.cssSelector("#passContainer")).sendKeys("mano123");
	}

}
