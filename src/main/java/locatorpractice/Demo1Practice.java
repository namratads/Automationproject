package locatorpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    driver.findElement(By.xpath("//input[@name='low-price']")).sendKeys("10000");
	    driver.findElement(By.xpath("//input[@name='high-price']")).sendKeys("30000");
	    driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	    
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,400)");
	    
	}

}
