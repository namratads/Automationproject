package mypracticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.nopcommerce.com/");
        
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");
//        
//        WebElement element = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
//        System.out.println(element.getText());
//        
//        WebElement element1 = driver.findElement(By.xpath("//div[@class='footer-upper']//buttoon"));
//        System.out.println(element1.getText());
//        
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Total number of Elements is "+ elements.size());
        
        for(WebElement wb : elements) {
        	System.out.println(wb.getText());
        }
        
        List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='footer-upper']"));
        System.out.println("Total number of Elements is "+ elements1.size());
        
        List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='footer-upper']//buttooon"));
        System.out.println("Total number of Elements is "+ elements2.size());
        
	}

}
