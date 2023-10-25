package mypracticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("namratashinde");
//		WebElement wb1 = driver.findElement(By.id("email"));
//        wb1.clear();
//        wb1.sendKeys("amrutashinde");
//       System.out.println("Result is " + wb1.getAttribute("value"));
//       System.out.println("Result is " +wb1.getText());
		
		WebElement wb1 = driver.findElement(By.xpath("//a[@class='_8esh']"));
		  System.out.println("Result is " + wb1.getAttribute("class"));
	       System.out.println("Result is " +wb1.getText());
	}

}
