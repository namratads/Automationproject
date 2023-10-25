package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPart8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("princess");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cleve");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("princess123@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("princess123@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("clevepri123");
	    driver.findElement(By.xpath("//select[@aria-label='Day']/child::option[1]")).click();
	    driver.findElement(By.xpath("//select[@aria-label='Month']/child::option[6]")).click();
	    driver.findElement(By.xpath("//select[@aria-label='Year']/child::option[32]")).click();
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
	    
	    
		
	}

}
