package locatorpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id=\"em2ail\" or @name=\"emai2l\"]")).sendKeys("Namrata");
		//driver.findElement(By.xpath("//input[@id=\"p2ass\" or @name=\"pa2ss\"]")).sendKeys("namo123");
		
		//driver.findElement(By.xpath("//input[@id=\"email\" and @name=\"email\"]")).sendKeys("Namrata");
		//driver.findElement(By.xpath("//input[@id=\"pass\" and @name=\"pass\"]")).sendKeys("Namrata");
		
		
	//	driver.findElement(By.xpath("//input[contains(@aria-label,'Email')]")).sendKeys("namrata");
	//	driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("namo123");

		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Email')]")).sendKeys("tommy");
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Pass')]")).sendKeys("namo123");
		
		driver.findElement(By.xpath("//button")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
	
}
