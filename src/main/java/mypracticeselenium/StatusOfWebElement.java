package mypracticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    WebElement wb = driver.findElement(By.xpath("//input[@type='text']"));

	    
	    System.out.println("Display status is "+wb.isDisplayed());
	    System.out.println("Enables status is "+wb.isEnabled());
	    System.out.println("Selected status is "+wb.isSelected());
	}

}
