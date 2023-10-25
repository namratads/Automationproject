package locatorpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//line 11 & 12 code for opening the perticular window
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//line 14 code for opening the application/web page in browser
	    driver.get("https://www.flipkart.com/");
	    //line 16 code for maximize the opening web page
	    driver.manage().window().maximize();
	    //line 20 code for close the small window on webpage
	    driver.findElement(By.xpath("//span[@role='button']")).click();
	    
	    WebElement searchbox = driver.findElement(By.name("q"));
	    searchbox.sendKeys("T-shirls");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	  //  WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	  //  searchbox.sendKeys("T-shirt");
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(5000);
	    //line 33 code for scrolling by usin pixel
	    js.executeScript("window.scrollBy(0,500)");
	    
	    //line 36 code for scrolling page till we find elemnt
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,500)");
	    
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,-500)");
	    
	   // driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
	}

}
